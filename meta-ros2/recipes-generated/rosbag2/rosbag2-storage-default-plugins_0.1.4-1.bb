
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROSBag2 SQLite3 storage plugin"
SECTION = "devel"

ROS_BUILD_DEPENDS = "pluginlib rcutils rosbag2-storage sqlite3-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "pluginlib rcutils rosbag2-storage sqlite3-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pluginlib rcutils rosbag2-storage sqlite3-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rosbag2-test-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_storage_default_plugins/0.1.4-1.zip;downloadfilename=rosbag2-storage-default-plugins_0.1.4-1.zip"
SRC_URI[md5sum] = "f90627676c9fd1aa1dbce68c8fc70852"
SRC_URI[sha256sum] = "3b3d9d0fa30b23330391ef5f1907e9dcec853774400c1bcfb2b0c50276675a62"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_storage_default_plugins-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

