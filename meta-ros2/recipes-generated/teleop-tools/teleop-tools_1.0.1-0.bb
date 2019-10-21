
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A set of generic teleoperation tools for any robot."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "joy-teleop key-teleop teleop-tools-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/dashing/teleop_tools/1.0.1-0.zip;downloadfilename=teleop-tools_1.0.1-0.zip"
SRC_URI[md5sum] = "3d240e3df915ab8730a2850a0a8c171b"
SRC_URI[sha256sum] = "e13d59edeacf615aa01ae9d3905f4cd7730d8ed1c22cef2a1476cd02f91cbe1e"

S = "${WORKDIR}/teleop_tools-release-release-dashing-teleop_tools-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

