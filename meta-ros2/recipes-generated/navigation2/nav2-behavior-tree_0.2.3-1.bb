
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "behaviortree-cpp builtin-interfaces geometry-msgs lifecycle-msgs nav2-common nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle rosidl-default-generators std-msgs std-msgs std-srvs tf2 tf2-geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "tf2-geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "behaviortree-cpp builtin-interfaces geometry-msgs lifecycle-msgs nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle rosidl-default-runtime std-msgs tf2 tf2-geometry-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_behavior_tree/0.2.3-1.zip;downloadfilename=nav2-behavior-tree_0.2.3-1.zip"
SRC_URI[md5sum] = "4d265539a6c7743cfa396df42c1ee8a4"
SRC_URI[sha256sum] = "eee263c9d07667c774d9d9bb6e80db75134adfc4e1c4c0aad9d994256f485152"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_behavior_tree-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

