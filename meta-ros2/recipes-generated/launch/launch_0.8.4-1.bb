
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


SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/dashing/launch/0.8.4-1.zip;downloadfilename=launch_0.8.4-1.zip"
SRC_URI[md5sum] = "f6ff83c8e2ad242da3888915be056cef"
SRC_URI[sha256sum] = "8a5e33f3bab35718c6059e7cd7d753cf525612a97d03e7f39e5d8da78383891f"

S = "${WORKDIR}/launch-release-release-dashing-launch-0.8.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

