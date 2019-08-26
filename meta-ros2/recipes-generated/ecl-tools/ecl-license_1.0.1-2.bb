
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Maintains the ecl licenses and also provides an install target for deploying licenses with the ecl libraries. "
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=f895f13378d9b55d775a2405d35506fd"


SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/dashing/ecl_license/1.0.1-2.zip;downloadfilename=ecl-license_1.0.1-2.zip"
SRC_URI[md5sum] = "90784c989f4d28767bd5b06dba2313c9"
SRC_URI[sha256sum] = "010171b85652739dee3144423866df0cb30c4961c16845c33f9c2e236665f65d"

S = "${WORKDIR}/ecl_tools-release-release-dashing-ecl_license-1.0.1-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

