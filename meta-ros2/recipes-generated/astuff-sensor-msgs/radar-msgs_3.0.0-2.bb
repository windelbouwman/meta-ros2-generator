
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generic Radar Messages"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces geometry-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/dashing/radar_msgs/3.0.0-2.zip;downloadfilename=radar-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "e56d66f818a952ba1f9c1bbc17f11ebc"
SRC_URI[sha256sum] = "b6d3b72551a5c26158bfb95a6aece9eb8fc5c7ca1912b3f2c583c1e4144ed9ab"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-dashing-radar_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

