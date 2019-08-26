
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Commonly used test helper classes and fixtures for rosbag2"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp rcutils"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rcutils"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_test_common/0.1.4-1.zip;downloadfilename=rosbag2-test-common_0.1.4-1.zip"
SRC_URI[md5sum] = "c9aaa47c2a53932a1b9f5c01611aaf33"
SRC_URI[sha256sum] = "4d0f08a4d4e0cf5493cf7a39abd2ce1e4802411f9b0411c71486b25e733a4fc4"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_test_common-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

