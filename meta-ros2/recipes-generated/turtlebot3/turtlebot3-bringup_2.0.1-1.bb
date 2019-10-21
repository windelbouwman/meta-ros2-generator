
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS 2 launch scripts for starting the TurtleBot3 "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "hls-lfcd-lds-driver robot-state-publisher rviz2 turtlebot3-description turtlebot3-node"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_bringup/2.0.1-1.zip;downloadfilename=turtlebot3-bringup_2.0.1-1.zip"
SRC_URI[md5sum] = "ec48c062609e4fadd68df4bfd899b199"
SRC_URI[sha256sum] = "d07de6c07e804e711f3ef5ff89bd6666aee8b25f43b1efeb74582e5b046821a6"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3_bringup-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

