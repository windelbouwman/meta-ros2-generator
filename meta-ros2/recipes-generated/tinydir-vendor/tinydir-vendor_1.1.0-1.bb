
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "CMake shim over tinydir: https://github.com/cxong/tinydir/"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/tinydir_vendor-release/archive/release/dashing/tinydir_vendor/1.1.0-1.zip;downloadfilename=tinydir-vendor_1.1.0-1.zip"
SRC_URI[md5sum] = "af7d4b2b2fb570f7a051a9bb86838953"
SRC_URI[sha256sum] = "9c3fa8be0e77e1dea76fe942ebbba0302f43632ae05dc264e3a550ed744dd4f9"

S = "${WORKDIR}/tinydir_vendor-release-release-dashing-tinydir_vendor-1.1.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

