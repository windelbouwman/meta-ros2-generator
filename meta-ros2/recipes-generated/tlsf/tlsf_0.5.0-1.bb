
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TLSF allocator version 2.4.6"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"


SRC_URI = "https://github.com/ros2-gbp/tlsf-release/archive/release/dashing/tlsf/0.5.0-1.zip;downloadfilename=tlsf_0.5.0-1.zip"
SRC_URI[md5sum] = "8519c93efc1b9de094fca055c4f32cf2"
SRC_URI[sha256sum] = "136e7ea94a4859c362ad0fb808343bf1e9aa16a36aee35bc04a8d424b2e28876"

S = "${WORKDIR}/tlsf-release-release-dashing-tlsf-0.5.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

