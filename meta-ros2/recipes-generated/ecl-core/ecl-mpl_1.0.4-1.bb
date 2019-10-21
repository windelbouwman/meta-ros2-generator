
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Metaprogramming tools move alot of runtime calculations to be shifted to compile time. This has only very elementary structures at this stage. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-license"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_mpl/1.0.4-1.zip;downloadfilename=ecl-mpl_1.0.4-1.zip"
SRC_URI[md5sum] = "399c01916ed73224b88764d08fa930cc"
SRC_URI[sha256sum] = "aed71e49890ba1ffbd80b8d9779e559501ef57e32d15c42e2e63727d58a4f8d0"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_mpl-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

