
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable components. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "camera-info-manager cv-bridge gazebo-dev gazebo-msgs gazebo-ros geometry-msgs image-transport nav-msgs rclcpp sensor-msgs std-msgs std-srvs tf2-geometry-msgs tf2-ros trajectory-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "camera-info-manager cv-bridge geometry-msgs image-transport nav-msgs sensor-msgs std-msgs std-srvs tf2-geometry-msgs tf2-ros trajectory-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "camera-info-manager cv-bridge gazebo-dev gazebo-msgs gazebo-ros geometry-msgs image-transport nav-msgs rclcpp sensor-msgs std-msgs std-srvs tf2-geometry-msgs tf2-ros trajectory-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common cv-bridge"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f7d4e3a22e6490b133f4eb99348a8124"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_plugins/3.3.4-1.zip;downloadfilename=gazebo-plugins_3.3.4-1.zip"
SRC_URI[md5sum] = "e5a50f45119e43f2387abe78653627bc"
SRC_URI[sha256sum] = "4892ff4c8ebd0fc8d95d635185c2d4cfcd1f0929b4cc1118cb764523a52cceba"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_plugins-3.3.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

