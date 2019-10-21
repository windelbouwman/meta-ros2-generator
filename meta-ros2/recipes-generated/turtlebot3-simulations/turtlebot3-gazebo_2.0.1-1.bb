
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Gazebo simulation package for the TurtleBot3 "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gazebo-ros-pkgs turtlebot3-description"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3_simulations-release/archive/release/dashing/turtlebot3_gazebo/2.0.1-1.zip;downloadfilename=turtlebot3-gazebo_2.0.1-1.zip"
SRC_URI[md5sum] = "79e78b19233e0386fc5a77c4b549629b"
SRC_URI[sha256sum] = "e71d8b18deff37e9633f4a463fb27c4b8178a3b64df20fb0eaea009028361277"

S = "${WORKDIR}/turtlebot3_simulations-release-release-dashing-turtlebot3_gazebo-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

