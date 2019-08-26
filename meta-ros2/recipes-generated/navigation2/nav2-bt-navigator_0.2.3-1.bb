
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "behaviortree-cpp geometry-msgs nav-msgs nav2-behavior-tree nav2-common nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle std-msgs std-srvs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "behaviortree-cpp geometry-msgs nav-msgs nav2-behavior-tree nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_bt_navigator/0.2.3-1.zip;downloadfilename=nav2-bt-navigator_0.2.3-1.zip"
SRC_URI[md5sum] = "31eb06c3949d21cc8b121e06aaf6d24f"
SRC_URI[sha256sum] = "360ee56206a9691e335c9db7b831c068eade28d23d6c1c116f53e1354b19ce3c"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_bt_navigator-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

