
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


SRC_URI = "https://github.com/ros2-gbp/fastrtps-release/archive/release/dashing/fastrtps/1.8.0-2.zip;downloadfilename=fastrtps_1.8.0-2.zip"
SRC_URI[md5sum] = "c3b7db9381a1f0571b628a3599d61577"
SRC_URI[sha256sum] = "03286d75a4d93c579390fda86c2d4f203db3e1bfe4ab98578840d7aa4f821d87"

S = "${WORKDIR}/fastrtps-release-release-dashing-fastrtps-1.8.0-2"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

