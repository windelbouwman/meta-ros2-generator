
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Messages and service files for the navigation2 stack"
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs builtin-interfaces geometry-msgs nav2-common rclcpp rosidl-default-generators std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs builtin-interfaces geometry-msgs rclcpp rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_msgs/0.2.6-1.zip;downloadfilename=nav2-msgs_0.2.6-1.zip"
SRC_URI[md5sum] = "a2099ea2d1fbb93939637958a169c008"
SRC_URI[sha256sum] = "b38ca51fd804413f7aef304f5bb07fc8bd9627ec9760e202157ec91b19f6cb04"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_msgs-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

