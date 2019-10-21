
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " tf2_msgs "
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs builtin-interfaces geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs builtin-interfaces geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs builtin-interfaces geometry-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_msgs/0.11.5-1.zip;downloadfilename=tf2-msgs_0.11.5-1.zip"
SRC_URI[md5sum] = "28976cbc7af4d8bedf48e4837dc2fdb2"
SRC_URI[sha256sum] = "52b13c2e43971a0290cfeba11c5378384faef4727ea9fd246acd58ad2915a2b9"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_msgs-0.11.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

