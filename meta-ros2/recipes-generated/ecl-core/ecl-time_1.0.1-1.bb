
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Timing utilities are very dependent on the system api provided for their use. This package provides a means for handling different timing models. Current support  - posix rt : complete. - macosx : posix timers only, missing absolute timers. - win : none. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-time-lite"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-time-lite"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_time/1.0.1-1.zip;downloadfilename=ecl-time_1.0.1-1.zip"
SRC_URI[md5sum] = "79265590298af007f98fd855f3e99bb6"
SRC_URI[sha256sum] = "9d94b413def1d7baa9194093fb5a83b1a0c8b907d60260ebdbd1202f2971f60a"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_time-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

