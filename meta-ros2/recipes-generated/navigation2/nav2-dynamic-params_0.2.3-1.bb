
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_dynamic_params/0.2.3-1.zip;downloadfilename=nav2-dynamic-params_0.2.3-1.zip"
SRC_URI[md5sum] = "b84e4b8367b30f367c7c6d931c35a322"
SRC_URI[sha256sum] = "303cb193773bb45b61d3d43e0c901c529ea4f26da6d225100840e98e9c2ce404"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_dynamic_params-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

