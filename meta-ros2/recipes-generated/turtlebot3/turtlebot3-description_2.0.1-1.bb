
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " 3D models of the TurtleBot3 for simulation and visualization "
SECTION = "devel"

ROS_BUILD_DEPENDS = "urdf"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "urdf"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "urdf"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_description/2.0.1-1.zip;downloadfilename=turtlebot3-description_2.0.1-1.zip"
SRC_URI[md5sum] = "0d9445a5ce0053bececfe57296e8a4b5"
SRC_URI[sha256sum] = "81acfce899bb3091115e8be8f2fe5ed91dfd6248290f80178e1449aa4259f8bf"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3_description-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

