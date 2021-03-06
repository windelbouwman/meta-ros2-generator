
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The param command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcl-interfaces rclpy ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "rcl-interfaces rclpy ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rcl-interfaces rclpy ros2cli ros2node ros2service"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2param/0.7.7-1.zip;downloadfilename=ros2param_0.7.7-1.zip"
SRC_URI[md5sum] = "2806ce146439d4ea1d3caf2c1584d402"
SRC_URI[sha256sum] = "d460cf7e0a10031b99673ec7250599e298622e8e0f28002b3599ac189b6cc1e6"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2param-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

