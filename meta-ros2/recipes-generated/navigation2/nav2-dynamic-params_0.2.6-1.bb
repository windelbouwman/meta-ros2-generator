
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides a validation class for ROS2 parameters with validation based on parameter type and defined bounds. Support for custom validation callbacks is also provided. Some useful convenience functions for event callbacks are also provided "
SECTION = "devel"

ROS_BUILD_DEPENDS = "nav2-common nav2-util rclcpp rclcpp-lifecycle"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp rclcpp-lifecycle"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rclcpp-lifecycle"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_dynamic_params/0.2.6-1.zip;downloadfilename=nav2-dynamic-params_0.2.6-1.zip"
SRC_URI[md5sum] = "acab0b2e2113a933348ba06aaa415197"
SRC_URI[sha256sum] = "bcc5dd2645ae3173511af1f43b5a4ceecfe5d35317db88ef1f5e5a444935e6de"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_dynamic_params-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

