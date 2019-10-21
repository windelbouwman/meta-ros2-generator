
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Extends c++ type traits and implements a few more to boot. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-license ecl-mpl"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-license ecl-mpl"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_type_traits/1.0.4-1.zip;downloadfilename=ecl-type-traits_1.0.4-1.zip"
SRC_URI[md5sum] = "5b17622fe6545b8d068f98c43e1e4ca5"
SRC_URI[sha256sum] = "2b2249a1b3061ff8c1ae57c3d09480b83f5b59f4dbcc6287d2475d1d32f0db9a"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_type_traits-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

