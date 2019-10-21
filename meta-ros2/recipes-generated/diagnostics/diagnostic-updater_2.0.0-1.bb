
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "diagnostic_updater contains tools for easily updating diagnostics. it is commonly used in device drivers to keep track of the status of output topics, device status, etc."
SECTION = "devel"

ROS_BUILD_DEPENDS = "diagnostic-msgs rclcpp rclpy std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native ament-cmake-python-native"
ROS_BUILD_EXPORT_DEPENDS = "diagnostic-msgs rclcpp rclpy std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "diagnostic-msgs rclcpp rclpy std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common rclcpp-lifecycle"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/diagnostics-release/archive/release/dashing/diagnostic_updater/2.0.0-1.zip;downloadfilename=diagnostic-updater_2.0.0-1.zip"
SRC_URI[md5sum] = "3e2a04d6a0485730ebad07ef6888e3e8"
SRC_URI[sha256sum] = "8b4373d3b7a991b0d31863d30b91c50a9c556f7a3adf081f2da2583e9da77cce"

S = "${WORKDIR}/diagnostics-release-release-dashing-diagnostic_updater-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

