
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Common statistical structures and algorithms for control systems. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-license ecl-linear-algebra ecl-mpl ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-config ecl-license ecl-linear-algebra ecl-mpl ecl-type-traits"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_statistics/1.0.4-1.zip;downloadfilename=ecl-statistics_1.0.4-1.zip"
SRC_URI[md5sum] = "059177cf905af5fe6177e5dc05d98e38"
SRC_URI[sha256sum] = "8c516f634ff11c12724610e4d32f91bdf5392239c2936b5bd07559d153dd7ea0"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_statistics-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

