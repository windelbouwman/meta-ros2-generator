
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Small lib to transform sensor_msgs with tf. Most notably, PointCloud2 "
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen sensor-msgs tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-auto-native eigen3-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen sensor-msgs tf2 tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = "eigen3-cmake-module-native"
ROS_EXEC_DEPENDS = "sensor-msgs tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_sensor_msgs/0.11.5-1.zip;downloadfilename=tf2-sensor-msgs_0.11.5-1.zip"
SRC_URI[md5sum] = "b024843a26e579c21cf303920ef20477"
SRC_URI[sha256sum] = "054d810302b66a68ebbaf35bc8b3c0a649563e3f14b30dd4894dea8eeb0cde14"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_sensor_msgs-0.11.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

