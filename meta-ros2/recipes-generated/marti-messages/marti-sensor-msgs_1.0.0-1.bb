
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  marti_sensor_msgs  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_sensor_msgs/1.0.0-1.zip;downloadfilename=marti-sensor-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "29a350d7fdc7857c3dda2c464ea06246"
SRC_URI[sha256sum] = "c674f276cf35bb38200a2b88ebd979989f3d9f0b8091ea056973cf61b6009f34"

S = "${WORKDIR}/marti_messages-release-release-dashing-marti_sensor_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

