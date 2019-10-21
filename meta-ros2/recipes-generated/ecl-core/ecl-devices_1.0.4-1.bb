
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides an extensible and standardised framework for input-output devices. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-containers ecl-errors ecl-license ecl-mpl ecl-threads ecl-type-traits ecl-utilities"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-containers ecl-errors ecl-license ecl-mpl ecl-threads ecl-type-traits ecl-utilities"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_devices/1.0.4-1.zip;downloadfilename=ecl-devices_1.0.4-1.zip"
SRC_URI[md5sum] = "ba0a2cc544d495a3b79643a9eab8f85e"
SRC_URI[sha256sum] = "837df3c61c79e70a6875f4f8dc93ed5eadb97b93336e4605bf2449d6da84966a"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_devices-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

