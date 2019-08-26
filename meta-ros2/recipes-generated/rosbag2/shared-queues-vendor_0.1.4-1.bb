
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


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/shared_queues_vendor/0.1.4-1.zip;downloadfilename=shared-queues-vendor_0.1.4-1.zip"
SRC_URI[md5sum] = "3cc30163d0f165b50f57460cf58a29af"
SRC_URI[sha256sum] = "4e2ccf36da94e21d0501fd9d55ca87bfcf60941bcfd5428d685d42aee6f13710"

S = "${WORKDIR}/rosbag2-release-release-dashing-shared_queues_vendor-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

