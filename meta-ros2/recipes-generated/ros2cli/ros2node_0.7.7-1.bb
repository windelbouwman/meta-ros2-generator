
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The node command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ros2cli"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2node/0.7.7-1.zip;downloadfilename=ros2node_0.7.7-1.zip"
SRC_URI[md5sum] = "1132a8bb94b2e09ffac4fb5554ea4ebb"
SRC_URI[sha256sum] = "22a55b3a28bf6934d65f3e79b34b04d872650bc24644ef7f7bdcc88a7525125e"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2node-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

