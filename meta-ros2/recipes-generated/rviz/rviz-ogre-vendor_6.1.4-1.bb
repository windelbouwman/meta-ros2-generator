
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around ogre3d, it provides a fixed CMake module and an ExternalProject build of ogre. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "libfreetype6-dev libx11-dev libxaw libxrandr opengl pkg-config"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libfreetype6-dev libx11-dev libxaw libxrandr opengl"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libfreetype6 libx11-dev libxaw libxrandr opengl"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_ogre_vendor/6.1.4-1.zip;downloadfilename=rviz-ogre-vendor_6.1.4-1.zip"
SRC_URI[md5sum] = "67b8d704faab6e490e008d787936867b"
SRC_URI[sha256sum] = "8357951369534f658b21c2bf2e20e2b70913a8d9bf96f2747714b5f2b4e5e3fa"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_ogre_vendor-6.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

