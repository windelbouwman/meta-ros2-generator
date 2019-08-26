
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


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_ogre_vendor/6.1.3-1.zip;downloadfilename=rviz-ogre-vendor_6.1.3-1.zip"
SRC_URI[md5sum] = "afe53c012e511d70922751b7b95a3cc8"
SRC_URI[sha256sum] = "2cec5bf001a4b7d1f49e2cdfa86b32b164bc78b216b355a8d3abdd1e0fae9b19"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_ogre_vendor-6.1.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

