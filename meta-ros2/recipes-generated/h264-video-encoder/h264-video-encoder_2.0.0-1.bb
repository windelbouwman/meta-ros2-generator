
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROS2 H264 encoder node"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common aws-ros2-common h264-encoder-core image-transport kinesis-video-msgs rclcpp rmw-implementation sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common aws-ros2-common image-transport kinesis-video-msgs launch launch-ros rmw-implementation sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e181b18ed9533044a61dea448605dcd5"


SRC_URI = "https://github.com/aws-gbp/h264_video_encoder-release/archive/release/dashing/h264_video_encoder/2.0.0-1.zip;downloadfilename=h264-video-encoder_2.0.0-1.zip"
SRC_URI[md5sum] = "5f99180b6e7a766b01b272bf4b9d8656"
SRC_URI[sha256sum] = "102a2dd303a68822681c83664342664ffa9f50c6c780d7218333e9129228002e"

S = "${WORKDIR}/h264_video_encoder-release-release-dashing-h264_video_encoder-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

