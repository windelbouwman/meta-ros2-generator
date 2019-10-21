
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Vendor package for concurrent queues from moodycamel"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/shared_queues_vendor/0.1.8-1.zip;downloadfilename=shared-queues-vendor_0.1.8-1.zip"
SRC_URI[md5sum] = "f95395a111a9e7174eab70bc157437aa"
SRC_URI[sha256sum] = "d550ae24a9817a36dc787cc149d4ce0a088543448437613e0c8a444e4e8c4043"

S = "${WORKDIR}/rosbag2-release-release-dashing-shared_queues_vendor-0.1.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

