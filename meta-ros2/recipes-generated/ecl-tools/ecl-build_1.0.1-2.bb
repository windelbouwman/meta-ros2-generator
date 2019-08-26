
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Collection of cmake/make build tools primarily for ecl development itself, but also contains a few cmake modules useful outside of the ecl. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/dashing/ecl_build/1.0.1-2.zip;downloadfilename=ecl-build_1.0.1-2.zip"
SRC_URI[md5sum] = "fe8d7a8040e86a9c8042709b47a87e70"
SRC_URI[sha256sum] = "42a7ad2f0486a1d9227d3f27c830d45778009597d642d4af1ee36fae217ba24f"

S = "${WORKDIR}/ecl_tools-release-release-dashing-ecl_build-1.0.1-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

