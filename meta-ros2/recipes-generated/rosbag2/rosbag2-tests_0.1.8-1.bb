
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Tests package for rosbag2"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rclcpp ros2bag rosbag2 rosbag2-converter-default-plugins rosbag2-storage rosbag2-storage-default-plugins rosbag2-test-common std-msgs test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_tests/0.1.8-1.zip;downloadfilename=rosbag2-tests_0.1.8-1.zip"
SRC_URI[md5sum] = "a9db7621690896cbe56b1b2e59e064e8"
SRC_URI[sha256sum] = "48ca83c0b4bf128b535a922d854313a7b32d438206d78e32a12b9bc8cca18ad6"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_tests-0.1.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

