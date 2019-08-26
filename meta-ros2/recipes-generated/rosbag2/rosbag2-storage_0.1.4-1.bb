
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROS2 independent storage format to store serialized ROS2 messages"
SECTION = "devel"

ROS_BUILD_DEPENDS = "pluginlib rcutils yaml-cpp-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "pluginlib rcutils yaml-cpp-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pluginlib rcutils yaml-cpp-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest ament-lint-auto ament-lint-common rosbag2-test-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_storage/0.1.4-1.zip;downloadfilename=rosbag2-storage_0.1.4-1.zip"
SRC_URI[md5sum] = "850ee9dc7c665f5e9132cbe19d10f145"
SRC_URI[sha256sum] = "047cae0420818674588ce277029d47c9113b92614a848ef16340d6993b757d13"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_storage-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

