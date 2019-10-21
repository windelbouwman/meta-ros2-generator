
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Interprocess mechanisms vary greatly across platforms - sysv, posix, win32, there are more than a few. This package provides an infrastructure to allow for developing cross platform c++ wrappers around the lower level c api's that handle these mechanisms. These make it not only easier to utilise such mechanisms, but allow it to be done consistently across platforms. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-threads ecl-time ecl-time-lite"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-threads ecl-time ecl-time-lite"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_ipc/1.0.4-1.zip;downloadfilename=ecl-ipc_1.0.4-1.zip"
SRC_URI[md5sum] = "d695fc0fe1aa29adae52f45177500828"
SRC_URI[sha256sum] = "0c0b8f23aa0bde0fbc5790ab5c5f11ce46ea191f05425cb7b6672fe8787fc65d"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_ipc-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

