""" Helper script to turn a ros distribution into ros packages.

The script does several things:
- start with a distribution list. A list of packages included in a certain ROS distro.
- for each package, analyze the package and generate a bitbake recipe.

"""

import logging
import argparse
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


logger = logging.getLogger('make-meta-ros')
this_dir = os.path.abspath(os.path.dirname(__file__))
work_dir = os.path.join(this_dir, 'work')


def main():
    # Parse arguments:
    parser = argparse.ArgumentParser()
    parser.add_argument('distro', type=argparse.FileType('r'), help='YAML file which can be found here https://github.com/ros/rosdistro')
    parser.add_argument('output_folder', help='Output folder for yocto recipes')
    parser.add_argument('-v', action='count', dest='verbose', default=0, help='Increase verbosity')
    args = parser.parse_args()

    loglevel = logging.DEBUG if args.verbose > 0 else logging.INFO
    coloredlogs.install(level=loglevel)

    # Install download cache:
    requests_cache.install_cache('download_cache')

    process_distro(args.distro, args.output_folder)


def process_distro(distro_filename, output_folder):
    os.makedirs(output_folder, exist_ok=True)

    logger.info('Loading ros distro %s', distro_filename)
    distro = yaml.safe_load(distro_filename)
    repositories = distro['repositories']
    for index, repository_name in enumerate(repositories, 1):
        logger.info('%s/%s: Taking a look at package: %s', index, len(repositories), repository_name)
        release = repositories[repository_name]['release']
        version = release['version']
        url = release['url']
        tags = release['tags']['release']
        assert url.endswith('.git')
        url = '{}/archive/{}.zip'.format(url[:-4], tags)

        if 'packages' in release:
            packages = release['packages']
            for package in packages:
                logger.debug('Subpackage %s', package)
                process_package(package, version, url, output_folder)
        else:
            process_package(repository_name, version, url, output_folder)
        
        # TODO: temp hack:
        # break


def process_package(package, version, url, output_folder):
    """ Process the given package. """
    logger.info('Processing package %s-%s', package, version)
    # Example url: https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake/0.7.3-1.zip
    template_variables = {
        'version': version,
        'package': package,
    }
    url = url.format_map(template_variables)
    logger.debug('Final url: %s', url)
    source_zip_data = download_file(url)

    recipe_filename = os.path.join(output_folder, '{}-{}.bb'.format(package, version))
    zip_archive = zipfile.ZipFile(io.BytesIO(source_zip_data))
    for filename in zip_archive.namelist():
        if filename.endswith('package.xml'):
            with zip_archive.open(filename) as f:
                license_line, license_md5 = extract_license(f)

            with io.TextIOWrapper(zip_archive.open(filename)) as f:
                tree = ElementTree.parse(f)

            root = tree.getroot()

            # Extract different xml elements:
            description = root.find('description').text.strip()
            license_element = root.find('license')
            license_text = license_element.text if license_element else None

            # Build tool:
            build_tools = '+'.join(e.text for e in root.findall('buildtool_depend'))
            dependencies = ' '.join(e.text for e in root.findall('depend'))
            
            md5sum = hashlib.md5(source_zip_data).hexdigest()
            sha256sum = hashlib.sha256(source_zip_data).hexdigest()

            data = {
                'description': description,
                'timestamp': time.ctime(),
                'build_tool': str(build_tools),
                'dependencies': dependencies,
                'url': url,
                'md5sum': md5sum,
                'sha256sum': sha256sum,
                'license': license_text,
                'license_line': license_line,
                'license_md5': license_md5,
            }
            generate_yocto_recipe(recipe_filename, data)


def extract_license(f):
    """ Extract license line, md5 sum and type from package.xml """
    for license_line, line in enumerate(f, 1):
        if b'license' in line:
            hasher = hashlib.md5()
            hasher.update(line)
            license_md5 = hasher.hexdigest()
            return str(license_line), license_md5
    logger.warning('No license found..')
    return None, None


def download_file(url):
    logger.debug('Downloading %s', url)
    t1 = time.time()
    r = requests.get(url, allow_redirects=True)
    t2 = time.time()
    if r.status_code != 200:
        raise RuntimeError('Error downloading file {}: url was {}'.format(r.status_code, url))
    dt = t2 - t1
    data = r.content
    size = len(data)
    speed = len(data) / dt
    logger.debug('Got %s bytes in %s seconds -> %s bytes/second', size, dt, speed)
    return data


recipe_template_text = r"""
# ATTENTION!! AUTOMATICALLY GENERATED on {{ timestamp }}

inherit: {{ build_tool }}

DESCRIPTION = "{{ description }}"
SECTION = "devel"
DEPENDS = "{{ dependencies }}"
{%if license %}
LICENSE = "{{ license }}"
LIC_FILES_CHKSUM = "file://package.xml;beginline={{ license_line }};endline={{ license_line }};md5={{ license_md5 }}"
{% endif %}

SRC_URI = "{{ url }}"
SRC_URI[md5sum] = "{{ md5sum }}"
SRC_URI[sha256sum] = "{{ sha256sum }}"

"""
recipe_template = jinja2.Template(recipe_template_text)


def generate_yocto_recipe(filename, data):
    text = recipe_template.render(data)
    with open(filename, 'w') as f:
        print(text, file=f)


if __name__ == "__main__":
    main()