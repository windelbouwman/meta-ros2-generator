
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This includes a suite of programs demo'ing various aspects of the ecl_core. It also includes various benchmarking and utility programs for use primarily with embedded systems. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-command-line ecl-config ecl-containers ecl-converters ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-license ecl-linear-algebra ecl-sigslots ecl-streams ecl-threads ecl-time-lite ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-command-line ecl-config ecl-containers ecl-converters ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-license ecl-linear-algebra ecl-sigslots ecl-streams ecl-threads ecl-time-lite ecl-type-traits"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_core_apps/1.0.1-1.zip;downloadfilename=ecl-core-apps_1.0.1-1.zip"
SRC_URI[md5sum] = "48696453f9af6b063d269c422b2d5b17"
SRC_URI[sha256sum] = "0430d6af9c19fe98c12312d733861bf39bf87bfc2cfc1f5678f7a973db374e80"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_core_apps-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

