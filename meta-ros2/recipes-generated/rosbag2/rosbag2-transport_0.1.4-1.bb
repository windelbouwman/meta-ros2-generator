
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Layer encapsulating ROS middleware to allow rosbag2 to be used with or without middleware"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp rmw rosbag2 shared-queues-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp rmw rosbag2 shared-queues-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rmw rosbag2 shared-queues-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rosbag2-test-common test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_transport/0.1.4-1.zip;downloadfilename=rosbag2-transport_0.1.4-1.zip"
SRC_URI[md5sum] = "8ea6fe16d9344b6523ba80fb847e91c8"
SRC_URI[sha256sum] = "5c34110cb46520c69f358d167b3e5c7e1da9084eddda7d007096817edf17feca"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_transport-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

