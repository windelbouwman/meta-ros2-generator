
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Messages for publishing monitoring data about ROS systems"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/ros_monitoring_msgs-release/archive/release/dashing/ros_monitoring_msgs/2.0.0-1.zip;downloadfilename=ros-monitoring-msgs_2.0.0-1.zip"
SRC_URI[md5sum] = "679da3fc50f9eacc34c9429ae4c3c1cf"
SRC_URI[sha256sum] = "11b7f5c049c623246198d1deff7d9f495fd566e87dbe52cbf727df9ff8a26626"

S = "${WORKDIR}/ros_monitoring_msgs-release-release-dashing-ros_monitoring_msgs-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

