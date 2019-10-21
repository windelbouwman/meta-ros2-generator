
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A mouse teleop tool for holonomic mobile robots."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs python-numpy python-tk rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/dashing/mouse_teleop/1.0.1-0.zip;downloadfilename=mouse-teleop_1.0.1-0.zip"
SRC_URI[md5sum] = "eb3a18ce7c083d496e1be26621bdbc84"
SRC_URI[sha256sum] = "3d1394169c7c3aeba07c4414de59da4aad042ce9c02c6d5a73f691bd0283a8b2"

S = "${WORKDIR}/teleop_tools-release-release-dashing-mouse_teleop-1.0.1-0"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

