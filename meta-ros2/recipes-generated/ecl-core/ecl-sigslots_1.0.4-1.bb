
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides a signal/slot mechanism (in the same vein as qt sigslots, boost::signals etc for intra-process communication. These include some improvements - they do not need a preprocessor, are fully type safe, allow for simple connections via a posix style string identifier and are multithread-safe. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-license ecl-threads"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-license ecl-threads"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_sigslots/1.0.4-1.zip;downloadfilename=ecl-sigslots_1.0.4-1.zip"
SRC_URI[md5sum] = "6841cd46a715604c5ed06230d9dd5e7d"
SRC_URI[sha256sum] = "ac775d56087a62da259e8a86a70b48fc827757fc8bf5514263c129c34dc5f4dd"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_sigslots-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

