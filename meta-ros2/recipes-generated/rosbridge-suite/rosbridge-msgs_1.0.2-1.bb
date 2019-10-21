
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing message files"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rosbridge_suite-release/archive/release/dashing/rosbridge_msgs/1.0.2-1.zip;downloadfilename=rosbridge-msgs_1.0.2-1.zip"
SRC_URI[md5sum] = "10de83b66bb49fe6931b4e4b3ae3108c"
SRC_URI[sha256sum] = "443d981d01eee38f3e6d0050354948abc685c8248467d4a40c163970717a61ba"

S = "${WORKDIR}/rosbridge_suite-release-release-dashing-rosbridge_msgs-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

