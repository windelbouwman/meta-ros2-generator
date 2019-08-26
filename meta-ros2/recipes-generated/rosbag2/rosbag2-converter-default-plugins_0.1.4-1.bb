
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing default plugins for format converters"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rmw rosbag2 rosidl-generator-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rmw rosbag2 rosidl-generator-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rmw rosbag2 rosidl-generator-cpp"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rcutils rmw-fastrtps-cpp rosbag2 rosbag2-test-common test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_converter_default_plugins/0.1.4-1.zip;downloadfilename=rosbag2-converter-default-plugins_0.1.4-1.zip"
SRC_URI[md5sum] = "fd28eeb8e687a3e8b43c1e6f44ad1be9"
SRC_URI[sha256sum] = "0af5e781d13d0e247a36735705c16422930bd33e502cbc80c7bc2d18c7c4ff3f"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_converter_default_plugins-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

