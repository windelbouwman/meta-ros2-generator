
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Kinesis Video Streams producer node"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common aws-ros2-common image-transport kinesis-manager kinesis-video-msgs rclcpp rmw-implementation"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rmw-implementation-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch launch-ros python3-yaml rmw-implementation"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/dashing/kinesis_video_streamer/3.0.0-2.zip;downloadfilename=kinesis-video-streamer_3.0.0-2.zip"
SRC_URI[md5sum] = "9047754ece4f57f442839718dedf2fae"
SRC_URI[sha256sum] = "2412dcc324057b563c0f5b03e68bba9378bbf992fb23ca8a92894ca4e6eacdd4"

S = "${WORKDIR}/kinesis_video_streamer-release-release-dashing-kinesis_video_streamer-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

