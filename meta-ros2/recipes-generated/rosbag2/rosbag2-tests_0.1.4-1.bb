
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


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_tests/0.1.4-1.zip;downloadfilename=rosbag2-tests_0.1.4-1.zip"
SRC_URI[md5sum] = "eaae0be666fefc6014de5fb044993102"
SRC_URI[sha256sum] = "e8582b16932ab7c9935eb9a28c68988bf05c0f27317c16fd9ac12c97dac3f5d5"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_tests-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

