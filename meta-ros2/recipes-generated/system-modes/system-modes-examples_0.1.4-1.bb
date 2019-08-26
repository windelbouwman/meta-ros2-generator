
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Simple example system for system_modes package."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libboost-program-options-dev rclcpp rclcpp-lifecycle system-modes"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libboost-program-options-dev rclcpp rclcpp-lifecycle system-modes"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libboost-program-options-dev rclcpp rclcpp-lifecycle system-modes"
ROS_TEST_DEPENDS = "ament-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/microROS/system_modes-release/archive/release/dashing/system_modes_examples/0.1.4-1.zip;downloadfilename=system-modes-examples_0.1.4-1.zip"
SRC_URI[md5sum] = "808b1c7bcf692d966208b1f85fe34cfd"
SRC_URI[sha256sum] = "c7df274e022b6a0c4e53148feba3dd61d57bc4d31c814021ff39b12eb28d4ae7"

S = "${WORKDIR}/system_modes-release-release-dashing-system_modes_examples-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

