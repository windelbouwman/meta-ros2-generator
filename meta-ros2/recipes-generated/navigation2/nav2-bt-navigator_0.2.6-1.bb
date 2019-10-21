
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "behaviortree-cpp geometry-msgs nav-msgs nav2-behavior-tree nav2-common nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle std-msgs std-srvs tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "behaviortree-cpp geometry-msgs nav-msgs nav2-behavior-tree nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle std-msgs tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_bt_navigator/0.2.6-1.zip;downloadfilename=nav2-bt-navigator_0.2.6-1.zip"
SRC_URI[md5sum] = "292cdc4f70b61d476906344682e4b5ef"
SRC_URI[sha256sum] = "6c795e49c553167cf0b7c55b71dc8bff5b5793afa6bb4b12a4c42eda0cff7a6f"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_bt_navigator-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

