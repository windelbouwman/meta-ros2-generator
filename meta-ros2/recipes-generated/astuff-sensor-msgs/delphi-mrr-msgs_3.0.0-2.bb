
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Message definitions for the Delphi MRR"
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


SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/dashing/delphi_mrr_msgs/3.0.0-2.zip;downloadfilename=delphi-mrr-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "ce006e2267c3b561f84fdf6c879d7c32"
SRC_URI[sha256sum] = "db832285ff2423be04e9fbe8ab0c83887a33d92c4e5ac4d7b54782208b5ba6b7"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-dashing-delphi_mrr_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

