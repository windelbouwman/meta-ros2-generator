
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The kartech_linear_actuator_msgs package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/dashing/kartech_linear_actuator_msgs/3.0.0-2.zip;downloadfilename=kartech-linear-actuator-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "6576fd477634852996eb839e320d6671"
SRC_URI[sha256sum] = "5e0f4b9eaeb96db1a49a49cef94ae2f5defe6358e7cb61ca0eddfd7b7325aea7"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-dashing-kartech_linear_actuator_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

