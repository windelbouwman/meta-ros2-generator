
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The Kinematics and Dynamics Library (KDL) defines a tree structure to represent the kinematic and dynamic parameters of a robot mechanism."
SECTION = "devel"

ROS_BUILD_DEPENDS = "orocos-kdl tinyxml tinyxml-vendor urdf urdfdom-headers"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "orocos-kdl urdfdom-headers"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "orocos-kdl tinyxml tinyxml-vendor urdf"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/kdl_parser-release/archive/release/dashing/kdl_parser/2.2.0-1.zip;downloadfilename=kdl-parser_2.2.0-1.zip"
SRC_URI[md5sum] = "1bc2611527c52fd740e7c380f3162bfb"
SRC_URI[sha256sum] = "6563cbd35c608dbddbf37a0d4c7bb26a958fc6b6202fb479c8ed87754172b5d0"

S = "${WORKDIR}/kdl_parser-release-release-dashing-kdl_parser-2.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

