
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Implementation of RTPS standard."
SECTION = "devel"

ROS_BUILD_DEPENDS = "asio fastcdr tinyxml2"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "fastcdr libssl-dev tinyxml2"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "fastcdr libssl-dev tinyxml2"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/fastrtps-release/archive/release/dashing/fastrtps/1.8.2-1.zip;downloadfilename=fastrtps_1.8.2-1.zip"
SRC_URI[md5sum] = "a541aee71276d07afe7dfa63703e567f"
SRC_URI[sha256sum] = "6c5b0a8b58ed788ee35fad275ee08ad1e5797c225b25309a708e07be681e9a7b"

S = "${WORKDIR}/fastrtps-release-release-dashing-fastrtps-1.8.2-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

