
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Action tutorial code examples"
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs rclpy rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/action_tutorials/0.7.8-1.zip;downloadfilename=action-tutorials_0.7.8-1.zip"
SRC_URI[md5sum] = "ed434d7e513e4131376bea7674f350f9"
SRC_URI[sha256sum] = "74226ccf84f12b2121481d9f234f34e0b26984fe8d9d28a99080fbae7ceeb727"

S = "${WORKDIR}/demos-release-release-dashing-action_tutorials-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

