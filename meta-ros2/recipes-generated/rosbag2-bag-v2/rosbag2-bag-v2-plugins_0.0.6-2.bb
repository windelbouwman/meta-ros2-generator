
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing storage and converter plugins for rosbag 1"
SECTION = "devel"

ROS_BUILD_DEPENDS = "pluginlib rclcpp rcutils ros1-bridge ros1-rosbag-storage-vendor rosbag2 rosbag2-storage"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "pluginlib rclcpp rcutils ros1-bridge ros1-rosbag-storage-vendor rosbag2 rosbag2-storage"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pluginlib rclcpp rcutils ros1-bridge ros1-rosbag-storage-vendor rosbag2 rosbag2-storage"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rosbag2-test-common std-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2_bag_v2-release/archive/release/dashing/rosbag2_bag_v2_plugins/0.0.6-2.zip;downloadfilename=rosbag2-bag-v2-plugins_0.0.6-2.zip"
SRC_URI[md5sum] = "f0d6ac5db3d0d328f4dbfab50efe620c"
SRC_URI[sha256sum] = "c46b621dfa2a8d02eb49190c7ca7d86418d9ea904b2be8237f7fa82db0c09824"

S = "${WORKDIR}/rosbag2_bag_v2-release-release-dashing-rosbag2_bag_v2_plugins-0.0.6-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

