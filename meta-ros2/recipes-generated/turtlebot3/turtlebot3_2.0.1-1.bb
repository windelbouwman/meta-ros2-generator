
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS 2 packages for TurtleBot3 "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "turtlebot3-bringup turtlebot3-cartographer turtlebot3-description turtlebot3-navigation2 turtlebot3-node turtlebot3-teleop"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3/2.0.1-1.zip;downloadfilename=turtlebot3_2.0.1-1.zip"
SRC_URI[md5sum] = "b20e0c5da2a94eb89e482c19557bfa03"
SRC_URI[sha256sum] = "5c8f4ecfe88abfd90256c867185f391840da54fd4bb1b5e0e4d9732c67b62af8"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

