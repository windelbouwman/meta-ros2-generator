
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


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_msgs/0.11.4-1.zip;downloadfilename=tf2-msgs_0.11.4-1.zip"
SRC_URI[md5sum] = "54a65530e6ea161d196334278c098b58"
SRC_URI[sha256sum] = "b360b7206742f9f80dfec25dd07471e09ab997cf0279eb370dd570814cac28b5"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_msgs-0.11.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

