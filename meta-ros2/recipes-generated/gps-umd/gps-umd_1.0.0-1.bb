
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "gps_umd metapackage"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gps-msgs gps-tools gpsd-client"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/dashing/gps_umd/1.0.0-1.zip;downloadfilename=gps-umd_1.0.0-1.zip"
SRC_URI[md5sum] = "679a9f90bac2c69a329ac8f90fbeb42f"
SRC_URI[sha256sum] = "2c1dcc19a59b762e1ec786bde424aae1129ad5a66e16ad2f9bd0cbcaee727983"

S = "${WORKDIR}/gps_umd-release-release-dashing-gps_umd-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

