
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Refactored map server for ROS2 Navigation "
SECTION = "devel"

ROS_BUILD_DEPENDS = "graphicsmagick launch-ros launch-testing nav-msgs nav2-common nav2-util rclcpp rclcpp-lifecycle std-msgs tf2 yaml-cpp-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "graphicsmagick launch-ros launch-testing nav-msgs nav2-util rclcpp rclcpp-lifecycle std-msgs tf2 yaml-cpp-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "graphicsmagick launch-ros launch-testing nav-msgs nav2-util rclcpp rclcpp-lifecycle std-msgs tf2 yaml-cpp-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_map_server/0.2.6-1.zip;downloadfilename=nav2-map-server_0.2.6-1.zip"
SRC_URI[md5sum] = "1d751b1361cf6aff17ef7f7b66131ad4"
SRC_URI[sha256sum] = "9fbed6b34b897e24e4bd72ebe82c385f2daf25e0b8674d7ab178dabec9aa0924"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_map_server-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

