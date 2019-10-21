
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides a cmake config for the default version of Gazebo for the ROS distribution. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libgazebo9-dev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gazebo9"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_dev/3.3.4-1.zip;downloadfilename=gazebo-dev_3.3.4-1.zip"
SRC_URI[md5sum] = "3a71efd219e281540a1a5c4f4af46983"
SRC_URI[sha256sum] = "b481eb9b23ca0388c6b9755dc8fd400251c8a27eb031d8ff22c25d81108b4794"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_dev-3.3.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

