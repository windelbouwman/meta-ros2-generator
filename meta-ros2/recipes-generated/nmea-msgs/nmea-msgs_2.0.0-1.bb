
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The nmea_msgs package contains messages related to data in the NMEA format."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces rosidl-default-generators std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/nmea_msgs-release/archive/release/dashing/nmea_msgs/2.0.0-1.zip;downloadfilename=nmea-msgs_2.0.0-1.zip"
SRC_URI[md5sum] = "bbf8ed336c2c268ed47b59f1fe30c5f2"
SRC_URI[sha256sum] = "d29195f9e6aed60cb16f06631b6867d9562a7dd08e53cba4ccd5f319d86149db"

S = "${WORKDIR}/nmea_msgs-release-release-dashing-nmea_msgs-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

