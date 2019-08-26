
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Vendor package for rosbag_storage of ROS1"
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost bzip2 libconsole-bridge-dev libgpgme-dev libssl-dev pkg-config pluginlib ros1-bridge"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native git-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2_bag_v2-release/archive/release/dashing/ros1_rosbag_storage_vendor/0.0.6-2.zip;downloadfilename=ros1-rosbag-storage-vendor_0.0.6-2.zip"
SRC_URI[md5sum] = "d137f4227f0a041cb0ce8266f4f9c0cd"
SRC_URI[sha256sum] = "1608cd6d5b7eaec619ea5c838bbbe65632e94bcc8e4e5f8d76c9a68abb5574c7"

S = "${WORKDIR}/rosbag2_bag_v2-release-release-dashing-ros1_rosbag_storage_vendor-0.0.6-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

