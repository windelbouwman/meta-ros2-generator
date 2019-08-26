
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


SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/dashing/depthimage_to_laserscan/2.2.1-1.zip;downloadfilename=depthimage-to-laserscan_2.2.1-1.zip"
SRC_URI[md5sum] = "18ed39cf80ab810189b82cbcd353313a"
SRC_URI[sha256sum] = "2cda149066919e1e30ba61c62d28c3707c76e4e03e926d20e43fa3cc625b8d1e"

S = "${WORKDIR}/depthimage_to_laserscan-release-release-dashing-depthimage_to_laserscan-2.2.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

