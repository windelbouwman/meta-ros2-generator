
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " tf2_geometry_msgs "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-auto-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_geometry_msgs/0.11.5-1.zip;downloadfilename=tf2-geometry-msgs_0.11.5-1.zip"
SRC_URI[md5sum] = "0687fdc539c41d1b8198374543e31c3e"
SRC_URI[sha256sum] = "af40dbfeef0628b4ff6c9cb5566292aa50e9cb846c92b033da885060355f2981"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_geometry_msgs-0.11.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

