
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


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/ros2bag/0.1.8-1.zip;downloadfilename=ros2bag_0.1.8-1.zip"
SRC_URI[md5sum] = "dd89e748e5de817fee1c94f65de9d8f5"
SRC_URI[sha256sum] = "7872351c92c80970500a95a80d575a6640d11fc59326a6d69efa5ad42fef53c6"

S = "${WORKDIR}/rosbag2-release-release-dashing-ros2bag-0.1.8-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

