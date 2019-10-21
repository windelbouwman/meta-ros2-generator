
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Cartographer is a system that provides real-time simultaneous localization and mapping (SLAM) in 2D and 3D across multiple platforms and sensor configurations. This package provides Cartographer's ROS integration. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "cartographer cartographer-ros-msgs eigen libpcl-all-dev lua5.2-dev nav-msgs pcl-conversions rclcpp sensor-msgs tf2 tf2-eigen tf2-msgs tf2-ros urdfdom-headers visualization-msgs yaml-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "cartographer cartographer-ros-msgs libpcl-all-dev lua5.2-dev nav-msgs rclcpp sensor-msgs tf2 tf2-msgs tf2-ros visualization-msgs yaml-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cartographer cartographer-ros-msgs libpcl-all-dev lua5.2-dev nav-msgs rclcpp sensor-msgs tf2 tf2-msgs tf2-ros visualization-msgs yaml-cpp"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"


SRC_URI = "https://github.com/ros2-gbp/cartographer_ros-release/archive/release/dashing/cartographer_ros/1.0.9000-1.zip;downloadfilename=cartographer-ros_1.0.9000-1.zip"
SRC_URI[md5sum] = "c5f3701871af4d0a95b6ded684ab5f1e"
SRC_URI[sha256sum] = "ca01457cec74cf73c0d4a4d6680521bf384c58f35b7f5f64b0e7b346ce24a964"

S = "${WORKDIR}/cartographer_ros-release-release-dashing-cartographer_ros-1.0.9000-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

