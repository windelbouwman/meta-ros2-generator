
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


SRC_URI = "https://github.com/ros2-gbp/ros_workspace-release/archive/release/dashing/ros_workspace/0.7.1-1.zip;downloadfilename=ros-workspace_0.7.1-1.zip"
SRC_URI[md5sum] = "c1db1455a30a7d7c1f4f043ccbd9ab52"
SRC_URI[sha256sum] = "f789ded32a9a8232b97140c6cff193970c34e3a208755f1fab62f73dd529a494"

S = "${WORKDIR}/ros_workspace-release-release-dashing-ros_workspace-0.7.1-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

