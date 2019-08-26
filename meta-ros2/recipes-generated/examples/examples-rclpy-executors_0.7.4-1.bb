
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of creating and using exectors to run multiple nodes in the same process"
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


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclpy_executors/0.7.4-1.zip;downloadfilename=examples-rclpy-executors_0.7.4-1.zip"
SRC_URI[md5sum] = "06c4615e4c9eb9f8835e0412c99a3b0c"
SRC_URI[sha256sum] = "ce6f4792517710e368edc595cddf9c8924f494c0d89e0dab3117e10478bb16c8"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclpy_executors-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

