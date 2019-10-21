
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ROS launch tool."
SECTION = "devel"

ROS_BUILD_DEPENDS = "osrf-pycommon"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "osrf-pycommon"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "osrf-pycommon"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/dashing/launch/0.8.7-1.zip;downloadfilename=launch_0.8.7-1.zip"
SRC_URI[md5sum] = "7e180dae4320dbb8b29e31405e58eaf5"
SRC_URI[sha256sum] = "76f4f93cc24c93e76e728959da3678f52c467908fbaa66be7a96f48ae17dcb42"

S = "${WORKDIR}/launch-release-release-dashing-launch-0.8.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

