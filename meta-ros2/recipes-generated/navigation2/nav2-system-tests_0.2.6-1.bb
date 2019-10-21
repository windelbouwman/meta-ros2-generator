
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "gazebo-ros-pkgs geometry-msgs launch-ros launch-ros launch-testing launch-testing nav-msgs nav2-amcl nav2-common nav2-lifecycle-manager nav2-msgs nav2-util rclcpp rclpy std-msgs tf2-geometry-msgs visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gazebo-ros-pkgs geometry-msgs launch-ros launch-ros launch-testing launch-testing lcov nav-msgs nav2-amcl nav2-bringup nav2-lifecycle-manager nav2-msgs nav2-util navigation2 rclcpp rclpy robot-state-publisher std-msgs tf2-geometry-msgs visualization-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-ros launch-testing launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_system_tests/0.2.6-1.zip;downloadfilename=nav2-system-tests_0.2.6-1.zip"
SRC_URI[md5sum] = "559973ac8bbb9d806527f86c54bea3d6"
SRC_URI[sha256sum] = "28390973f4599f3bb4a059df0eb4969fb9ac218df4afb1983dee5ba16b2c4152"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_system_tests-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

