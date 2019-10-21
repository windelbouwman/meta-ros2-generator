
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " A robot-agnostic teleoperation node to convert keyboard commands to Twist messages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e0ab6366e5108a0da760802f538e6ed"


SRC_URI = "https://github.com/ros2-gbp/teleop_twist_keyboard-release/archive/release/dashing/teleop_twist_keyboard/2.3.1-1.zip;downloadfilename=teleop-twist-keyboard_2.3.1-1.zip"
SRC_URI[md5sum] = "1921d8b9e6e547171ae8d3b18dfc9870"
SRC_URI[sha256sum] = "f364244b3a3c0d22cb4d179f37246a29943767088428d22e50dd3e719d8d8812"

S = "${WORKDIR}/teleop_twist_keyboard-release-release-dashing-teleop_twist_keyboard-2.3.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

