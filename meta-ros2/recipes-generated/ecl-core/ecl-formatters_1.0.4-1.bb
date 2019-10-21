
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_formatters/1.0.4-1.zip;downloadfilename=ecl-formatters_1.0.4-1.zip"
SRC_URI[md5sum] = "bbd77c03aa7573e1d24e4a504d4e8c8e"
SRC_URI[sha256sum] = "ab006aa33e44ecee5009d3ac57ed39c1ac44624a1ee4b3f8c2627e4547b071b2"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_formatters-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

