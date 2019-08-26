
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Includes various supporting tools and utilities for c++ programming. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-concepts ecl-license ecl-mpl"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-concepts ecl-license ecl-mpl"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_utilities/1.0.1-1.zip;downloadfilename=ecl-utilities_1.0.1-1.zip"
SRC_URI[md5sum] = "61f528a533d9690558fabfdf0b3baceb"
SRC_URI[sha256sum] = "6325b806ae034234772ea77b74387006b2eea49bccc8ae0c8fbd6ec9c96bd39a"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_utilities-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

