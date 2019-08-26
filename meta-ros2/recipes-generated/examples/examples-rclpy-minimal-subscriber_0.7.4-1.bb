
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal subscribers using rclpy."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclpy std-msgs"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclpy_minimal_subscriber/0.7.4-1.zip;downloadfilename=examples-rclpy-minimal-subscriber_0.7.4-1.zip"
SRC_URI[md5sum] = "4ce41c654e7500f7fbbb7c748e5cd61d"
SRC_URI[sha256sum] = "409c88cbd5fddc8b15be8dddb6ef7aac710179798ba6b47a79efadaa5a9227d5"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclpy_minimal_subscriber-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

