
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "behaviortree-cpp builtin-interfaces geometry-msgs lifecycle-msgs nav-msgs nav2-common nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle std-msgs std-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "std-srvs tf2-geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "behaviortree-cpp builtin-interfaces geometry-msgs lifecycle-msgs nav-msgs nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle std-msgs tf2 tf2-geometry-msgs tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_behavior_tree/0.2.6-1.zip;downloadfilename=nav2-behavior-tree_0.2.6-1.zip"
SRC_URI[md5sum] = "04f2153391a28f866f1803c065021212"
SRC_URI[sha256sum] = "ca3c4bc49f95ff697febcee87af71841194138b7281e3bb1d63e873b506433ca"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_behavior_tree-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

