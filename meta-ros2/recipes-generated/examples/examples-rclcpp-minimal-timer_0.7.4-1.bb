
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal nodes which have timers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_timer/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-timer_0.7.4-1.zip"
SRC_URI[md5sum] = "74a1e72730ce2a3767fc818fde084d40"
SRC_URI[sha256sum] = "4258706307dea30e52122071c7ab6884a15e2da125b31da5fe5a0f37169e19f4"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_timer-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

