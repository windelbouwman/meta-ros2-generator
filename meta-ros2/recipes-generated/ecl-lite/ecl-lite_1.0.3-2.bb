
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Libraries and utilities for embedded and low-level linux development. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_lite/1.0.3-2.zip;downloadfilename=ecl-lite_1.0.3-2.zip"
SRC_URI[md5sum] = "49bb0bfeca7a440e7afc0568c1fcc5fc"
SRC_URI[sha256sum] = "7cae6f27253de536bf9bdeed64f30787f5154bff0a1b52d427f2a76d3a82ab20"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_lite-1.0.3-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

