
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "This package defines messages for NCS inference"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rosidl-default-generators sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime sensor-msgs std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"


SRC_URI = "https://github.com/ros2-gbp/ros2_object_msgs-release/archive/release/dashing/object_msgs/0.4.0-1.zip;downloadfilename=object-msgs_0.4.0-1.zip"
SRC_URI[md5sum] = "2182adb49bd1cdfabd5e12cd445c903a"
SRC_URI[sha256sum] = "fd68e8a92b8d0f44403e987cf647d48de5a33e8183a83ff18969b9a6ccd374fc"

S = "${WORKDIR}/object_msgs-release-release-dashing-object_msgs-0.4.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

