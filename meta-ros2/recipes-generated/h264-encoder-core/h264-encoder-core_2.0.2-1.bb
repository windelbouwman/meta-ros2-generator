
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Common base code for ROS1/ROS2 H264 encoder node"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common ffmpeg"
ROS_BUILDTOOL_DEPENDS = "catkin-native cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common ffmpeg"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e181b18ed9533044a61dea448605dcd5"


SRC_URI = "https://github.com/aws-gbp/h264_encoder_core-release/archive/release/dashing/h264_encoder_core/2.0.2-1.zip;downloadfilename=h264-encoder-core_2.0.2-1.zip"
SRC_URI[md5sum] = "1e0a25f725cd3ddac946dea2faafd1b6"
SRC_URI[sha256sum] = "8eabc5f4ae249dccaa1bb7ddf3431de17587d95ac73d2c52f2913c4a4547d83b"

S = "${WORKDIR}/h264_encoder_core-release-release-dashing-h264_encoder_core-2.0.2-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

