
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


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2param/0.7.4-1.zip;downloadfilename=ros2param_0.7.4-1.zip"
SRC_URI[md5sum] = "fd817b977b1cf7075ee1df2915ba3069"
SRC_URI[sha256sum] = "d02c68e8596a779a80cb969327001762eb7aef8c54bc3cc1bf216fab0e4329d8"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2param-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

