
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This library provides lean and mean error mechanisms. It includes c style error functions as well as a few useful macros. For higher level mechanisms, refer to ecl_exceptions. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_errors/1.0.3-2.zip;downloadfilename=ecl-errors_1.0.3-2.zip"
SRC_URI[md5sum] = "d678c9d5e44328b11c1deecc60685696"
SRC_URI[sha256sum] = "d143005d4e98f8ef3422250953e4525fe95a43eaa470aea56848aa5365651a10"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_errors-1.0.3-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

