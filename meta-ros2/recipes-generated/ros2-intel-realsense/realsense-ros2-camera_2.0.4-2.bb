
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The realsense_ros2_camera package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces cv-bridge eigen image-transport librealsense2 rclcpp realsense-camera-msgs rmw-implementation sensor-msgs std-msgs tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces cv-bridge librealsense2 rclcpp realsense-camera-msgs rmw-implementation rosidl-default-runtime sensor-msgs std-msgs tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2_intel_realsense-release/archive/release/dashing/realsense_ros2_camera/2.0.4-2.zip;downloadfilename=realsense-ros2-camera_2.0.4-2.zip"
SRC_URI[md5sum] = "6367249c5c8f59e1ef2f1e1f96160301"
SRC_URI[sha256sum] = "6c6853deaf41e68c62672609a28983e4ca55fd8035cedaba87627cebc076e83f"

S = "${WORKDIR}/ros2_intel_realsense-release-release-dashing-realsense_ros2_camera-2.0.4-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

