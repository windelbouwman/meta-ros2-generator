
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Contains message and service definitions used by tts."
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/aws-gbp/tts-release/archive/release/dashing/tts_interfaces/2.0.1-1.zip;downloadfilename=tts-interfaces_2.0.1-1.zip"
SRC_URI[md5sum] = "df2fae013a263895c472df3d062d1fed"
SRC_URI[sha256sum] = "8cea333825da0c151d0b292a536335fa925b1f323a3a2f0fe6bc608065cba627"

S = "${WORKDIR}/tts-release-release-dashing-tts_interfaces-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

