
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Minimal action client examples"
SECTION = "devel"

ROS_BUILD_DEPENDS = "example-interfaces rclcpp rclcpp-action"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "example-interfaces rclcpp rclcpp-action"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces rclcpp rclcpp-action"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_action_client/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-action-client_0.7.4-1.zip"
SRC_URI[md5sum] = "c856b17d795ac485dd8395a63ef9f252"
SRC_URI[sha256sum] = "e89e7fe62b84d73e4af698cc46ef2ae5d4bbe95361e99a70bd9a2a98316cb613"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_action_client-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

