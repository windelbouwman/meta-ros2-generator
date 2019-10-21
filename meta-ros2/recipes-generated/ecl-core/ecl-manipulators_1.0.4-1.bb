
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Deploys various manipulation algorithms, currently just feedforward filters (interpolations). "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-exceptions ecl-formatters ecl-geometry ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-exceptions ecl-formatters ecl-geometry ecl-license"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_manipulators/1.0.4-1.zip;downloadfilename=ecl-manipulators_1.0.4-1.zip"
SRC_URI[md5sum] = "c96cae794d36cbe8eb3c26bdc2fadfe8"
SRC_URI[sha256sum] = "2c9aebd2838fecffe9c5e70036fda1cb90840cbc71b7018991d86e058ee14d6d"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_manipulators-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

