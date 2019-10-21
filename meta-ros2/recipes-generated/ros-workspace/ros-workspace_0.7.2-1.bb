
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides the prefix level environment files for ROS 2 packages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake-core ament-package"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=f2c2560c422b1f619ff2ce48845782f5"


SRC_URI = "https://github.com/ros2-gbp/ros_workspace-release/archive/release/dashing/ros_workspace/0.7.2-1.zip;downloadfilename=ros-workspace_0.7.2-1.zip"
SRC_URI[md5sum] = "b3e43c4d5c462281529f25cc074906d1"
SRC_URI[sha256sum] = "3211a9e69c6106f9df7f3ad754f829316cb88d318ba482d658a39d6b2fee2ca1"

S = "${WORKDIR}/ros_workspace-release-release-dashing-ros_workspace-0.7.2-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

