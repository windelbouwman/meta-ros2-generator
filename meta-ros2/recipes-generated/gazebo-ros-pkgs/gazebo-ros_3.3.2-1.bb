
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Utilities to interface with"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces gazebo-dev gazebo-msgs rclcpp std-srvs tinyxml-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces gazebo-dev gazebo-msgs geometry-msgs rclcpp sensor-msgs std-srvs tinyxml-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces gazebo-dev gazebo-msgs rclcpp std-srvs tinyxml-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common geometry-msgs sensor-msgs std-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_ros/3.3.2-1.zip;downloadfilename=gazebo-ros_3.3.2-1.zip"
SRC_URI[md5sum] = "3c496e795ecbeaecef4f4be713a9d41d"
SRC_URI[sha256sum] = "0d8bb1579fd139593ac4f8855093378b8cf0b294e3d6b2415f179f1f970fef03"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_ros-3.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

