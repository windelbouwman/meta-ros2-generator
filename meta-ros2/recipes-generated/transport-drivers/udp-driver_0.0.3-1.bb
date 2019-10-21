
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A template class and associated utilities which encapsulate basic reading from UDP sockets"
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost rclcpp rclcpp-lifecycle std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "boost rclcpp rclcpp-lifecycle std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "boost rclcpp rclcpp-lifecycle std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=bb69307f9a8566360ce04a9b7e6a00b7"


SRC_URI = "https://github.com/ros-drivers-gbp/transport_drivers-release/archive/release/dashing/udp_driver/0.0.3-1.zip;downloadfilename=udp-driver_0.0.3-1.zip"
SRC_URI[md5sum] = "52e35860fa5057a074bf82a211d68919"
SRC_URI[sha256sum] = "263fb7d85951b8667534b8c124d6952b2a44e6b2d2405a78e08e979ede40a153"

S = "${WORKDIR}/transport_drivers-release-release-dashing-udp_driver-0.0.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

