
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "depthimage_to_laserscan"
SECTION = "devel"

ROS_BUILD_DEPENDS = "image-geometry libopencv-dev rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "image-geometry libopencv-dev rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "image-geometry libopencv-dev rclcpp sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/dashing/depthimage_to_laserscan/2.2.2-1.zip;downloadfilename=depthimage-to-laserscan_2.2.2-1.zip"
SRC_URI[md5sum] = "bcd13917f6e36dc3d565b304a61e380e"
SRC_URI[sha256sum] = "45ec9d0561fa003d0862a6dd3ada215b87b2269acb81d6fc33878f7b6c617ebc"

S = "${WORKDIR}/depthimage_to_laserscan-release-release-dashing-depthimage_to_laserscan-2.2.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

