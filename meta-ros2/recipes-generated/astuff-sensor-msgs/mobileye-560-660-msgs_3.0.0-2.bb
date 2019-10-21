
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Message definitions for the Mobileye 560/660"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/dashing/mobileye_560_660_msgs/3.0.0-2.zip;downloadfilename=mobileye-560-660-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "c7db7e9dbe401713b6a489b2b0b78520"
SRC_URI[sha256sum] = "e003b8782546026f9c266f1a9ea8db1a17bb21848ab7e21f6aaa9a8cc8e3363f"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-dashing-mobileye_560_660_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

