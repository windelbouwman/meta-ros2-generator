
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Utilities to interface with"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces gazebo-dev gazebo-msgs rclcpp rclpy std-srvs tinyxml-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces gazebo-dev gazebo-msgs geometry-msgs rclcpp rclpy sensor-msgs std-srvs tinyxml-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces gazebo-dev gazebo-msgs launch-ros rclcpp rclpy std-srvs tinyxml-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common geometry-msgs sensor-msgs std-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_ros/3.3.4-1.zip;downloadfilename=gazebo-ros_3.3.4-1.zip"
SRC_URI[md5sum] = "0263e0ddd2b54e8c87a71b48052d9c4c"
SRC_URI[sha256sum] = "cb6e1629b55fbaddfb95a5cfdfc7487d2ac37850b4350c9e94a05537539aeb65"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_ros-3.3.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

