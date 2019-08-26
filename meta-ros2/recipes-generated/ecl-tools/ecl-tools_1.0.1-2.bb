
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Tools and utilities for ecl development. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/dashing/ecl_tools/1.0.1-2.zip;downloadfilename=ecl-tools_1.0.1-2.zip"
SRC_URI[md5sum] = "bbf55166bbb3d0eb7b4d9f0e48800f52"
SRC_URI[sha256sum] = "079137d8b79942a61699193999ef6b8de99bd72c0098602dc551e431838dad3c"

S = "${WORKDIR}/ecl_tools-release-release-dashing-ecl_tools-1.0.1-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

