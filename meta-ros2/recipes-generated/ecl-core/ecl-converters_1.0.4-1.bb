
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Some fast/convenient type converters, mostly for char strings or strings. These are not really fully fleshed out, alot of them could use the addition for the whole range of fundamental types (e.g. all integers, not just int, unsigned int).  They will come as the need arises. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-mpl ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-mpl ecl-type-traits"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_converters/1.0.4-1.zip;downloadfilename=ecl-converters_1.0.4-1.zip"
SRC_URI[md5sum] = "1ee7e4d8742fc73902333e12c0271a52"
SRC_URI[sha256sum] = "367e8820f0a470a7e2caa336dbf599bc266b5962436803accdacba58d5c530d8"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_converters-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

