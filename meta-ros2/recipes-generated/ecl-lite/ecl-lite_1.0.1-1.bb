
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Libraries and utilities for embedded and low-level linux development. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-converters-lite ecl-errors ecl-io ecl-sigslots-lite ecl-time-lite"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_lite/1.0.1-1.zip;downloadfilename=ecl-lite_1.0.1-1.zip"
SRC_URI[md5sum] = "8ba49cef4fd445ae7db8a48c5d23a4e8"
SRC_URI[sha256sum] = "ae66dabb0c999df05edb8dfcca74b747cda6474fd0e2dc1a28ce76c4e590565d"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_lite-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

