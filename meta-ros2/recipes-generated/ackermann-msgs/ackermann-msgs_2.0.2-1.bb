
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROS2 messages for robots using Ackermann steering."
SECTION = "devel"

ROS_BUILD_DEPENDS = "std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-drivers-gbp/ackermann_msgs-release/archive/release/dashing/ackermann_msgs/2.0.2-1.zip;downloadfilename=ackermann-msgs_2.0.2-1.zip"
SRC_URI[md5sum] = "ff5fe4f9e3e6620e9275db4ed261bb30"
SRC_URI[sha256sum] = "888b97afd6ecfe0b0f9a6c72a2a648acae340afaf043a7490600a632a6fa9d0c"

S = "${WORKDIR}/ackermann_msgs-release-release-dashing-ackermann_msgs-2.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

