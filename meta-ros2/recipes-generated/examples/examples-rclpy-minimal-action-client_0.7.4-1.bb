
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal action clients using rclpy."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclpy_minimal_action_client/0.7.4-1.zip;downloadfilename=examples-rclpy-minimal-action-client_0.7.4-1.zip"
SRC_URI[md5sum] = "12f24f4861ae98db495fac79a7d3923b"
SRC_URI[sha256sum] = "29e43bad1fe6d20f176f39a0c4c8db69f7b15e89c358abd87c7c64a9718d8e84"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclpy_minimal_action_client-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

