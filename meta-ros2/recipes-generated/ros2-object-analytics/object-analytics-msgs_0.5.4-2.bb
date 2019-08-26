
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "object analytics message definition"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs object-msgs object-msgs rosidl-default-generators sensor-msgs std-msgs tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs object-msgs object-msgs rosidl-default-runtime sensor-msgs std-msgs tf2-ros"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"


SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/dashing/object_analytics_msgs/0.5.4-2.zip;downloadfilename=object-analytics-msgs_0.5.4-2.zip"
SRC_URI[md5sum] = "4b09de38d32592967efe1ff256dd18f7"
SRC_URI[sha256sum] = "12b8f94eb815ab75c9bacf3f9912836b43f9d367013149d31670f0c063eb24f4"

S = "${WORKDIR}/ros2_object_analytics-release-release-dashing-object_analytics_msgs-0.5.4-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

