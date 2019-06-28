""" Helper script to turn a ros distribution into ros packages.

The script does several things:
- start with a distribution list. A list of packages included in a certain ROS distro.
- for each package, analyze the package and generate a bitbake recipe.

"""

import logging
import argparse
from collections import namedtuple
import io
import time
import contextlib
import hashlib
import os
import xml.etree.ElementTree as ElementTree
import zipfile

# TODO: progress bar: import tqdm
import coloredlogs
import jinja2
import requests
import requests_cache
import yaml
import networkx as nx


logger = logging.getLogger("make-meta-ros")
this_dir = os.path.abspath(os.path.dirname(__file__))
work_dir = os.path.join(this_dir, "work")


def main():
    # Parse arguments:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "distro",
        type=argparse.FileType("r"),
        help="YAML file which can be found here https://github.com/ros/rosdistro",
    )
    parser.add_argument("output_folder", help="Output folder for yocto recipes")
    parser.add_argument(
        "-v", action="count", dest="verbose", default=0, help="Increase verbosity"
    )
    args = parser.parse_args()

    loglevel = logging.DEBUG if args.verbose > 0 else logging.INFO
    coloredlogs.install(level=loglevel)

    # Install download cache:
    requests_cache.install_cache("download_cache")

    process_distro(args.distro, args.output_folder)


def process_distro(distro_filename, output_folder):
    os.makedirs(output_folder, exist_ok=True)
    ros_packages = list(analyze_distro(distro_filename))

    make_dependency_graph(ros_packages)
    create_bitbake_recipes(ros_packages, output_folder)


def analyze_distro(distro_filename):
    distro = "dashing"
    logger.info("Loading ros distro %s", distro_filename)
    distro_meta_data = yaml.safe_load(distro_filename)
    repositories = distro_meta_data["repositories"]
    for index, repository_name in enumerate(repositories, 1):
        logger.info(
            "%s/%s: Taking a look at package: %s",
            index,
            len(repositories),
            repository_name,
        )
        release = repositories[repository_name]["release"]
        version = release["version"]
        url = release["url"]
        tags = release["tags"]["release"]
        assert url.endswith(".git")
        url = "{}/archive/{}.zip".format(url[:-4], tags)

        if "packages" in release:
            packages = release["packages"]
            for package in packages:
                logger.debug("Subpackage %s", package)
                yield process_package(distro, repository_name, package, version, url)
        else:
            yield process_package(
                distro, repository_name, repository_name, version, url
            )

        # TODO: temp hack:
        # break


def process_package(distro, package_group, package, version, url):
    """ Process the given package. """
    logger.info("Processing package %s-%s", package, version)
    # Example url: https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake/0.7.3-1.zip
    url_template_variables = {"version": version, "package": package}
    url = url.format_map(url_template_variables)
    logger.debug("Final url: %s", url)

    ros_package = RosPackage(distro, package_group, package, version, url)

    source_zip_data = download_file(url)
    ros_package.md5sum = hashlib.md5(source_zip_data).hexdigest()
    ros_package.sha256sum = hashlib.sha256(source_zip_data).hexdigest()
    zip_archive = zipfile.ZipFile(io.BytesIO(source_zip_data))

    # {{ package_group }}-release-release-{{ distro }}-{{ package }}-{{ version }}
    top_folder = "{}-release-release-{}-{}-{}".format(
        package_group, distro, package, version
    )
    if top_folder not in zip_archive.namelist():
        # logger.warning('non-regular top folder: %s', top_folder)
        top_folder = os.path.dirname(zip_archive.namelist()[0])
    package_xml_filename = os.path.join(top_folder, "package.xml")

    with zip_archive.open(package_xml_filename) as f:
        ros_package.license_line, ros_package.license_md5 = extract_license(f)

    with io.TextIOWrapper(zip_archive.open(package_xml_filename)) as f:
        tree = ElementTree.parse(f)

    root = tree.getroot()

    # Extract different xml elements:
    ros_package.description = normalize_description(root.find("description").text)
    license_element = root.find("license")
    # print(license_element)
    ros_package.license_text = (
        None if license_element is None else validate_license(license_element.text)
    )
    # print(license_text)

    # buildtool_depend_elements = root.findall('buildtool_depend')
    # print('build tool depend:', [e.text for e in buildtool_depend_elements])
    # Build tool:
    build_type_element = root.find("export/build_type")
    if build_type_element is None:
        logger.warning("No build tool set, assuming ament.")
        build_type = "ament_cmake"
    else:
        build_type = build_type_element.text
    ros_package.build_type = build_type

    # print(build_tool)

    # See also: ros.org/reps/rep-0140.html.
    # Add the different dependencies:
    dep_tags = [
        "exec_depend",
        "build_depend",
        "build_export_depend",
        "buildtool_depend",
        "buildtool_export_depend",
        "test_depend",
        "doc_depend",
    ]
    dependencies = {}
    for dep_tag in dep_tags:
        deps = [e.text for e in root.findall(dep_tag)]
        dependencies[dep_tag] = deps

    # Special case 'depend' == 'exec_depend', 'build_depend' and 'build_export_depend'
    deps = [e.text for e in root.findall("depend")]
    dependencies["exec_depend"].extend(deps)
    dependencies["build_depend"].extend(deps)
    dependencies["build_export_depend"].extend(deps)

    ros_package.dependencies = dependencies
    return ros_package


def make_dependency_graph(ros_packages):
    G = nx.DiGraph()
    dep_tags = [
        "exec_depend",
        "build_depend",
        "build_export_depend",
        "buildtool_depend",
        "buildtool_export_depend",
    ]
    for package in ros_packages:
        G.add_node(package.name, attr_dict={"name": package.name})
        for tag in dep_tags:
            for dep in package.dependencies[tag]:
                G.add_edge(package.name, dep, label=tag)

    nx.write_gexf(G, "dependencies.gexf")


class RosPackage:
    def __init__(self, distro, group, name, version, url):
        self.distro = distro
        self.group = group
        self.name = name  # Name still in ros format!
        self.version = version
        self.url = url

    def __repr__(self):
        return "RosPackage {} {}".format(self.name, self.version)


def create_bitbake_recipes(ros_packages, output_folder):
    package_map = {p.name: p for p in ros_packages}
    for ros_package in ros_packages:
        create_bitbake_recipe(ros_package, package_map, output_folder)


def create_bitbake_recipe(ros_package, package_map, output_folder):
    # Recipe filename is: <package>_<version>.bb
    name = yocto_package_name(ros_package.name)
    base_filename = "{}_{}".format(name, ros_package.version)
    zip_filename = base_filename + ".zip"
    group_folder = os.path.join(output_folder, yocto_package_name(ros_package.group))
    os.makedirs(group_folder, exist_ok=True)
    recipe_filename = os.path.join(group_folder, base_filename + ".bb")
    logger.info("Creating bitbake recipe %s", recipe_filename)

    # To prevent circular dependency when building ament_cmake itself.
    if ros_package.group == ros_package.build_type:
        logger.warning(
            'Package %s build with %s, patching to "ament_inception".',
            name,
            ros_package.build_type,
        )
        build_tool = "ament_inception"
    else:
        build_tool = ros_package.build_type

    # Construct dependencies:
    deps, build_deps = get_transitive_dependencies(ros_package, package_map)

    normal_deps = list(map(yocto_package_name, deps))
    native_deps = [yocto_package_name(p) + "-native" for p in build_deps]
    dependencies = " ".join(normal_deps + native_deps)

    has_license = bool(ros_package.license_line)
    if has_license:

        data = {
            "distro": ros_package.distro,
            "package_group": ros_package.group,
            "package": ros_package.name,
            "version": ros_package.version,
            "description": ros_package.description,
            "timestamp": time.ctime(),
            "build_tool": build_tool,
            "build_type": ros_package.build_type,
            "dependencies": dependencies,
            "url": ros_package.url,
            "download_filename": zip_filename,
            "md5sum": ros_package.md5sum,
            "sha256sum": ros_package.sha256sum,
            "has_license": has_license,
            "license": ros_package.license_text,
            "license_line": ros_package.license_line,
            "license_md5": ros_package.license_md5,
        }
        generate_yocto_recipe(recipe_filename, data)


def traverse(ros_package, path, package_map):
    yield ros_package
    deps = ros_package.dependencies[path]
    for dep in deps:
        if dep in package_map:
            sub_package = package_map[dep]
            yield from traverse(sub_package, path, package_map)


def get_transitive_dependencies(ros_package, package_map):
    # dep_tags = ['exec_depend', 'build_depend', 'build_export_depend', 'buildtool_depend', 'buildtool_export_depend']
    deps = []
    host_deps = []
    deps.extend(ros_package.dependencies["exec_depend"])  # this we require for sure.
    deps.extend(
        ros_package.dependencies["build_depend"]
    )  # We require this for this package.
    deps.extend(
        ros_package.dependencies["build_export_depend"]
    )  # We require this for depending packages.
    host_deps.extend(ros_package.dependencies["buildtool_depend"])
    host_deps.extend(ros_package.dependencies["buildtool_export_depend"])

    for p in traverse(ros_package, "build_depend", package_map):
        # print(p)
        # deps.extend(p.dependencies['build_export_depend'])
        # host_deps.extend(p.dependencies['buildtool_export_depend'])
        pass

    # for p in traverse(ros_package, 'buildtool_depend', package_map):
    # d2, _ = get_transitive_dependencies(p, package_map)
    # host_deps.extend(d2)
    # print(p)

    # for dep in deps:
    # print(dep)
    # if dep in package_map:
    # child_package = package_map[dep]
    # get_transitive_dependencies(child_package, package_map)

    # build_dep_tags = ['buildtool_depend', 'buildtool_export_depend']
    # for build_dep_tag in build_dep_tags:
    return deps, host_deps


def yocto_package_name(name):
    """ Convert to yocto package name (replace _ by -). """
    return name.replace("_", "-")


def normalize_description(text):
    return " ".join(p.strip() for p in text.split("\n"))


def validate_license(text):
    parts = text.split(",")
    return " & ".join(map(warp_license, map(str.strip, parts)))


# This maps license identifiers from ros format to yocto format.
license_map = {
    "Apache License 2.0": "Apache-2.0",
    "Apache 2.0": "Apache-2.0",
    "Apache License": "Apache-2.0",
    "Version 2.0": "Apache-2.0",
    "BSD License 2.0": "BSD-2-Clause",
    "BSD": "BSD",
    "MIT": "MIT",
    "LGPL": "LGPL",
    "GNU Lesser Public License 2.1": "LGPL-2.1",
}


def warp_license(text):
    """ Some fuzzy mapping according to GNU Lesser Public License 2.1 """
    return license_map[text]


def extract_license(f):
    """ Extract license line, md5 sum and type from package.xml """
    for license_line, line in enumerate(f, 1):
        if b"license" in line:
            hasher = hashlib.md5()
            hasher.update(line)
            license_md5 = hasher.hexdigest()
            return str(license_line), license_md5
    logger.warning("No license found..")
    return None, None


def download_file(url):
    logger.debug("Downloading %s", url)
    t1 = time.time()
    r = requests.get(url, allow_redirects=True)
    t2 = time.time()
    if r.status_code != 200:
        raise RuntimeError(
            "Error downloading file {}: url was {}".format(r.status_code, url)
        )
    dt = t2 - t1
    data = r.content
    size = len(data)
    speed = len(data) / dt
    logger.debug("Got %s bytes in %s seconds -> %s bytes/second", size, dt, speed)
    return data


recipe_template_text = r"""
# ATTENTION!! AUTOMATICALLY GENERATED on {{ timestamp }}

DESCRIPTION = "{{ description }}"
SECTION = "devel"
DEPENDS = "{{ dependencies }}"

{%if has_license %}
LICENSE = "{{ license }}"
LIC_FILES_CHKSUM = "file://package.xml;beginline={{ license_line }};endline={{ license_line }};md5={{ license_md5 }}"
{% endif %}

SRC_URI = "{{ url }};downloadfilename={{ download_filename }}"
SRC_URI[md5sum] = "{{ md5sum }}"
SRC_URI[sha256sum] = "{{ sha256sum }}"

S = "${WORKDIR}/{{ package_group }}-release-release-{{ distro }}-{{ package }}-{{ version }}"

inherit {{ build_tool }}

BBCLASSEXTEND += "native"

"""
recipe_template = jinja2.Template(recipe_template_text)


def generate_yocto_recipe(filename, data):
    text = recipe_template.render(data)
    with open(filename, "w") as f:
        print(text, file=f)


if __name__ == "__main__":
    main()
