
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing default plugins for format converters"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rmw rmw-fastrtps-cpp rosbag2 rosidl-generator-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rmw rmw-fastrtps-cpp rosbag2 rosidl-generator-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rmw rmw-fastrtps-cpp rosbag2 rosidl-generator-cpp"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rcutils rmw-fastrtps-cpp rosbag2 rosbag2-test-common test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2_converter_default_plugins/0.1.8-1.zip;downloadfilename=rosbag2-converter-default-plugins_0.1.8-1.zip"
SRC_URI[md5sum] = "c157effc928e5edcf1365fa2df1cb952"
SRC_URI[sha256sum] = "4b8c5fb6f0ba1fe605378371651be530868daa1b7993d3c0ab7b52a6aafd5ad4"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2_converter_default_plugins-0.1.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

