
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal publishers using rclpy."
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclpy_minimal_publisher/0.7.4-1.zip;downloadfilename=examples-rclpy-minimal-publisher_0.7.4-1.zip"
SRC_URI[md5sum] = "b64de0c6fb6cc2911f776773e77dc6e7"
SRC_URI[sha256sum] = "b0e729547bce31a1b78bd01d6fdacdf271c4230a44f07084687e1c68dbbbd8c3"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclpy_minimal_publisher-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

