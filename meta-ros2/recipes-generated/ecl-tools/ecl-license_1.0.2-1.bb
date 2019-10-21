
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/dashing/ecl_license/1.0.2-1.zip;downloadfilename=ecl-license_1.0.2-1.zip"
SRC_URI[md5sum] = "e15edf0110ae48e6622ed41dd47602f0"
SRC_URI[sha256sum] = "2e9f8d7b4229d5d81b09c86aaf55cc91e8beb49ed230c6029e5265e62e0b525c"

S = "${WORKDIR}/ecl_tools-release-release-dashing-ecl_license-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

