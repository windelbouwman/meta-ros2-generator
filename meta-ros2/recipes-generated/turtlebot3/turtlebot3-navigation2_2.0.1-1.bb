
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS 2 launch scripts for navigation2 "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "nav2-bringup"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_navigation2/2.0.1-1.zip;downloadfilename=turtlebot3-navigation2_2.0.1-1.zip"
SRC_URI[md5sum] = "75a25dd4a43ba67d1d55786e4e111798"
SRC_URI[sha256sum] = "2ca9932236909e16600263a469c99a415e112020352e98d724ee305bf1dd5a6e"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3_navigation2-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

