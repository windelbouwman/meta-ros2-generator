
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code using pyflakes and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pyflakes3"
ROS_TEST_DEPENDS = "ament-pep8 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_pyflakes/0.7.7-1.zip;downloadfilename=ament-pyflakes_0.7.7-1.zip"
SRC_URI[md5sum] = "43369f2997b5391377c0d62dd7e0276e"
SRC_URI[sha256sum] = "e1d01d29c122c5703f892771bb81d3407b732a1ad68367bdf6e695e8a7d80376"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_pyflakes-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

