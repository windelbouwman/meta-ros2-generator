
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Interface for using ROS with the"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gazebo-dev gazebo-msgs gazebo-plugins gazebo-ros"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD & LGPL & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=8caad55b0e7a31e039fbcff07dba789e"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_ros_pkgs/3.3.4-1.zip;downloadfilename=gazebo-ros-pkgs_3.3.4-1.zip"
SRC_URI[md5sum] = "0b8c69c59c07149e6d21f3db0233e751"
SRC_URI[sha256sum] = "a058807727eea37124e59acdbd61476326127d4848c613e8dc3be2d6340682e3"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_ros_pkgs-3.3.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

