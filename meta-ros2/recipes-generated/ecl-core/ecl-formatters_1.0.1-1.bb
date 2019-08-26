
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The formatters here simply format various input types to a specified text format. They can be used with most streaming types (including both ecl and stl streams). "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-converters ecl-exceptions ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-converters ecl-exceptions ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_formatters/1.0.1-1.zip;downloadfilename=ecl-formatters_1.0.1-1.zip"
SRC_URI[md5sum] = "d7d28b7c949b3466479baf3e8a5b9b5e"
SRC_URI[sha256sum] = "fb926b0a27d922f1ef89f00b377c7c1d6fd18ed3f20e0a9b722783fbd2b33c7b"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_formatters-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

