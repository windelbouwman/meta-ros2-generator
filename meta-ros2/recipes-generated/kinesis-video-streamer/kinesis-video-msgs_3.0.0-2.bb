
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Messages for transmitting video frames to Kinesis Video Streams."
SECTION = "devel"

ROS_BUILD_DEPENDS = "diagnostic-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "diagnostic-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "diagnostic-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/dashing/kinesis_video_msgs/3.0.0-2.zip;downloadfilename=kinesis-video-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "49e419bf564bac4dc0236f9fd3530ae5"
SRC_URI[sha256sum] = "7bb8647057d77927603aaccdd53114bf3cd165c3d8b12b9c61caa316f11f073c"

S = "${WORKDIR}/kinesis_video_streamer-release-release-dashing-kinesis_video_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

