
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal service servers using rclpy."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces rclpy std-msgs"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclpy_minimal_service/0.7.4-1.zip;downloadfilename=examples-rclpy-minimal-service_0.7.4-1.zip"
SRC_URI[md5sum] = "5ad37a05aabf8a6e8db5cb74e7cdcec0"
SRC_URI[sha256sum] = "228a28f4114868a857e87f466ff73b505483f63b8393d9a31c798fa7cfce339e"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclpy_minimal_service-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

