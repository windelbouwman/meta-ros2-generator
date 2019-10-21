
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Message and service types: custom messages and services for TurtleBot3 packages for ROS2 "
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs builtin-interfaces std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs builtin-interfaces std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3_msgs-release/archive/release/dashing/turtlebot3_msgs/2.2.0-1.zip;downloadfilename=turtlebot3-msgs_2.2.0-1.zip"
SRC_URI[md5sum] = "e0659e151c6ac76d5146a05e3ecbb818"
SRC_URI[sha256sum] = "48894d7b75a6d629ee9ab8131b49ab27dce5a66dbe3ff97a90ceb1882e14cea3"

S = "${WORKDIR}/turtlebot3_msgs-release-release-dashing-turtlebot3_msgs-2.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

