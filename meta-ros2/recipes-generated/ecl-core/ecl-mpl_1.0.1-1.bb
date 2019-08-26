
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Metaprogramming tools move alot of runtime calculations to be shifted to compile time. This has only very elementary structures at this stage. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-license"
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_mpl/1.0.1-1.zip;downloadfilename=ecl-mpl_1.0.1-1.zip"
SRC_URI[md5sum] = "fa7f7ef68c12bb77ccdb1009a82b6aeb"
SRC_URI[sha256sum] = "7946bdb29567787b46389bceaeed4d8441919979238d817f5edaaebeaf95c9fe"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_mpl-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

