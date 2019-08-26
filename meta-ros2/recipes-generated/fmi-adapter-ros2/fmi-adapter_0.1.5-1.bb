
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Wraps FMUs for co-simulation"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcl-interfaces rclcpp rclcpp-components rclcpp-lifecycle std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch launch-ros rcl-interfaces rclcpp rclcpp-components rclcpp-lifecycle std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch-testing rcutils"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/boschresearch/fmi_adapter_ros2-release/archive/release/dashing/fmi_adapter/0.1.5-1.zip;downloadfilename=fmi-adapter_0.1.5-1.zip"
SRC_URI[md5sum] = "c390ebde0fb94051dba95aaf2935dafe"
SRC_URI[sha256sum] = "92e3d358095a990ef5ca31dc88e62a7b51d013b9d140d3d311c96eb7c68eacc3"

S = "${WORKDIR}/fmi_adapter_ros2-release-release-dashing-fmi_adapter-0.1.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

