
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "CMake macros for downloading files with ament"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/samsung-ros/ament_download-release/archive/release/dashing/ament_download/0.0.1-1.zip;downloadfilename=ament-download_0.0.1-1.zip"
SRC_URI[md5sum] = "1c1c5b3c9e32322a18b2435cf04ed596"
SRC_URI[sha256sum] = "05b116073232447235b4e9e7834cde013708fc553df7c73c272f7e038d424311"

S = "${WORKDIR}/ament_download-release-release-dashing-ament_download-0.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

