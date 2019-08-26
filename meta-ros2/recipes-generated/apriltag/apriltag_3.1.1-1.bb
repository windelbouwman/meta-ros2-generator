
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "AprilTag detector library"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/AprilRobotics/apriltag-release/archive/release/dashing/apriltag/3.1.1-1.zip;downloadfilename=apriltag_3.1.1-1.zip"
SRC_URI[md5sum] = "59424db39d94f43a4600ff2132b0e9d0"
SRC_URI[sha256sum] = "c3e672014cdb8d3010b378f6cae2829657ab82ad1e483d3932a60423a0c63bbb"

S = "${WORKDIR}/apriltag-release-release-dashing-apriltag-3.1.1-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

