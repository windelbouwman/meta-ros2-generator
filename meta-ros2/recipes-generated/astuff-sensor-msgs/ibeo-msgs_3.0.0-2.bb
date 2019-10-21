
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing messages for Ibeo sensors."
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


SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/dashing/ibeo_msgs/3.0.0-2.zip;downloadfilename=ibeo-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "0ca4a3113ae9c8af1aee09905247ffa8"
SRC_URI[sha256sum] = "97dfe96702ecb1e33fa7c5e4a342e47934ad6c24b2b36f0f2fd3fff359094fde"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-dashing-ibeo_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

