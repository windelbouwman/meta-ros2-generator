
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Common utilities for ROS2 nodes using Amazon Web Services."
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/aws_ros2_common-release/archive/release/dashing/aws_ros2_common/1.0.0-1.zip;downloadfilename=aws-ros2-common_1.0.0-1.zip"
SRC_URI[md5sum] = "81a106ff2479c4f37bad5be2e0871c92"
SRC_URI[sha256sum] = "d9fb8cee4aa1fdf1d73dcd29f715724c199153cd6cf20076096c660f860b14fc"

S = "${WORKDIR}/aws_ros2_common-release-release-dashing-aws_ros2_common-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

