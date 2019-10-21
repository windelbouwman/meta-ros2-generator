
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides simple support to cmath, filling in holes or redefining in a c++ formulation where desirable. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-license ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-license ecl-type-traits"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_math/1.0.4-1.zip;downloadfilename=ecl-math_1.0.4-1.zip"
SRC_URI[md5sum] = "c76c7e1fe56523f1e9d2800044328fe5"
SRC_URI[sha256sum] = "bcc55c01772b6bc135bd9dddc90527d6696f9bfacc68f7be8daa36a9359fb6f1"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_math-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

