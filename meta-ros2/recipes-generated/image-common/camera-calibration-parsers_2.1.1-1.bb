
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " camera_calibration_parsers contains routines for reading and writing camera calibration parameters. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp sensor-msgs yaml-cpp-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp sensor-msgs yaml-cpp-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp sensor-msgs yaml-cpp-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/dashing/camera_calibration_parsers/2.1.1-1.zip;downloadfilename=camera-calibration-parsers_2.1.1-1.zip"
SRC_URI[md5sum] = "bf1fef55d241f6b244dcc9fd9711564c"
SRC_URI[sha256sum] = "8099dd2543bc888d2c379b977ea28d86afe71b000008d44ed9f19d6d9736e36e"

S = "${WORKDIR}/image_common-release-release-dashing-camera_calibration_parsers-2.1.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

