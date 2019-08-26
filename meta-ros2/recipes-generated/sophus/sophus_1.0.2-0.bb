
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " C++ implementation of Lie Groups using Eigen. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/yujinrobot-release/sophus-release/archive/release/dashing/sophus/1.0.2-0.zip;downloadfilename=sophus_1.0.2-0.zip"
SRC_URI[md5sum] = "67ea2a7a93752140cda27d2188d5f76c"
SRC_URI[sha256sum] = "af6351352729d6202e67cb0ddba39ecaf54522dbf58909faf150ba66c1e39346"

S = "${WORKDIR}/sophus-release-release-dashing-sophus-1.0.2-0"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

