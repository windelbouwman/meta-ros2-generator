
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Packages for interfacing ROS2 with OpenCV, a library of programming functions for real time computer vision."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cv-bridge image-geometry"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/dashing/vision_opencv/2.1.2-1.zip;downloadfilename=vision-opencv_2.1.2-1.zip"
SRC_URI[md5sum] = "9ef2e9c9b2c01d5982b495022f863434"
SRC_URI[sha256sum] = "2bea394f75087af110e5faaad0a97aed2a6e14ce631ac593c706944a9abb2a3d"

S = "${WORKDIR}/vision_opencv-release-release-dashing-vision_opencv-2.1.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

