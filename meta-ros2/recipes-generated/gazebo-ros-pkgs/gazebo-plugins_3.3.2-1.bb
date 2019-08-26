
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable components. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "camera-info-manager cv-bridge gazebo-dev gazebo-ros geometry-msgs image-transport nav-msgs rclcpp sensor-msgs std-msgs tf2-geometry-msgs tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "camera-info-manager cv-bridge geometry-msgs image-transport nav-msgs sensor-msgs std-msgs tf2-geometry-msgs tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "camera-info-manager cv-bridge gazebo-dev gazebo-ros geometry-msgs image-transport nav-msgs rclcpp sensor-msgs std-msgs tf2-geometry-msgs tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common cv-bridge"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f7d4e3a22e6490b133f4eb99348a8124"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_plugins/3.3.2-1.zip;downloadfilename=gazebo-plugins_3.3.2-1.zip"
SRC_URI[md5sum] = "7d5270f70b5f31ce5e18502cfbddedf9"
SRC_URI[sha256sum] = "69503175176c4e69825de348f4683ed0d12c7cf5b5a8f8960ef590e023d315cf"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_plugins-3.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

