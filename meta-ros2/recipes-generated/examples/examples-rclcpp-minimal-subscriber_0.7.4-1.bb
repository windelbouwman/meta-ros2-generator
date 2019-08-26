
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal subscribers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_subscriber/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-subscriber_0.7.4-1.zip"
SRC_URI[md5sum] = "1ea04d3e855b6b004d6b7f1017e9bfe3"
SRC_URI[sha256sum] = "a006e76a267bb6b4f8771967f76e1dbe56b63d11071d0a522eb4f5ed66b6fcad"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_subscriber-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

