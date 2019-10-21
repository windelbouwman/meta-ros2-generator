
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This avoids use of dynamic storage (malloc/new) and thread safety (mutexes) to provide a very simple sigslots implementation that can be used for *very* embedded development. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-errors ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_sigslots_lite/1.0.3-2.zip;downloadfilename=ecl-sigslots-lite_1.0.3-2.zip"
SRC_URI[md5sum] = "732d3aa2686ce0f2084e71c961a39b50"
SRC_URI[sha256sum] = "e9256f0bacbd99091db0b11e1e715b00783051c0caf3bb87db8abdfe10658798"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_sigslots_lite-1.0.3-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

