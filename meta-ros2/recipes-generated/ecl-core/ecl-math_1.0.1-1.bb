
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_math/1.0.1-1.zip;downloadfilename=ecl-math_1.0.1-1.zip"
SRC_URI[md5sum] = "2ef4b65676a5e5ddc3ff6759b8dd3833"
SRC_URI[sha256sum] = "ad7d31d67b71698deda4d19fdbe1488239ae18df5261fc8044a3b4b8b51a004d"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_math-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

