
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code against the style conventions in PEP 8 and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-lint pydocstyle"
ROS_TEST_DEPENDS = "ament-flake8 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_pep257/0.7.11-1.zip;downloadfilename=ament-pep257_0.7.11-1.zip"
SRC_URI[md5sum] = "d3840b57451004c4a18ee9d2dae20170"
SRC_URI[sha256sum] = "05cb393b3797b54c7a07ab6fcdcfb368eefdfeebcd737c348d9c688da2eb5fc1"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_pep257-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

