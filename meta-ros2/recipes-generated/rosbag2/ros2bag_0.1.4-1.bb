
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Entry point for rosbag in ROS 2 "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ros2cli rosbag2-transport"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ros2cli rosbag2-transport"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ros2cli rosbag2-transport"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/ros2bag/0.1.4-1.zip;downloadfilename=ros2bag_0.1.4-1.zip"
SRC_URI[md5sum] = "c08565fcd71a5d6af6d67939b6d74749"
SRC_URI[sha256sum] = "7a6e7adf3320cc7e14bd31badaa0894596ed10e3ff2f67eabc3b2861ffbeadc3"

S = "${WORKDIR}/rosbag2-release-release-dashing-ros2bag-0.1.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

