
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "HTTP Streaming of ROS Image Topics in Multiple Formats"
SECTION = "devel"

ROS_BUILD_DEPENDS = "async-web-server-cpp cv-bridge ffmpeg image-transport rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "async-web-server-cpp cv-bridge ffmpeg image-transport rclcpp sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/web_video_server-release/archive/release/dashing/web_video_server/1.0.0-1.zip;downloadfilename=web-video-server_1.0.0-1.zip"
SRC_URI[md5sum] = "b5d3816c24710ef4e056b28ec0760880"
SRC_URI[sha256sum] = "ed8da4bbdd010e51f13adc2e8a725c51fbb13c330e038f01b621124bf0a017b7"

S = "${WORKDIR}/web_video_server-release-release-dashing-web_video_server-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

