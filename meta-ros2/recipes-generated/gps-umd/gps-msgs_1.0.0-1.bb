
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "GPS messages for use in GPS drivers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/dashing/gps_msgs/1.0.0-1.zip;downloadfilename=gps-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "6ecdd7aa8a565e00cb9f64c6e42ed2a1"
SRC_URI[sha256sum] = "ded0533c384e4a25e4820a0ecd77f91b9bb0fac05eacbd075ab0e7996729c9dc"

S = "${WORKDIR}/gps_umd-release-release-dashing-gps_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

