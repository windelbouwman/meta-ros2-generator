
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  This package provides a C++ interface for camera calibration information.  It provides CameraInfo, and handles SetCameraInfo service requests, saving and restoring the camera calibration data.  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "camera-calibration-parsers image-transport rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "camera-calibration-parsers image-transport rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "camera-calibration-parsers image-transport rclcpp sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/dashing/camera_info_manager/2.1.1-1.zip;downloadfilename=camera-info-manager_2.1.1-1.zip"
SRC_URI[md5sum] = "595a06fe47e40d2ac3bc1739af2f59c8"
SRC_URI[sha256sum] = "c5c8295496a8894b63ec19fc1619ae982f59ed9880f2e49f750b20ce27766456"

S = "${WORKDIR}/image_common-release-release-dashing-camera_info_manager-2.1.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

