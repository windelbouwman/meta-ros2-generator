
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Teleoperation node using keyboard for TurtleBot3. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rclpy"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_teleop/2.0.1-1.zip;downloadfilename=turtlebot3-teleop_2.0.1-1.zip"
SRC_URI[md5sum] = "f7e38a21686c9e83b2e003e1ad7f5829"
SRC_URI[sha256sum] = "ea6e818ddf955e4c89f5e7a6ee1d098f818217444b9f7dc6b5c1bcf52237c0b1"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3_teleop-2.0.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

