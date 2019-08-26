
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_manipulators/1.0.1-1.zip;downloadfilename=ecl-manipulators_1.0.1-1.zip"
SRC_URI[md5sum] = "63e77720454c32e4f21dbc205e3048c2"
SRC_URI[sha256sum] = "4df42cc1e7f23889d807bf4f67c63d3cb33a9ebc922bb83da6138a759b9014db"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_manipulators-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

