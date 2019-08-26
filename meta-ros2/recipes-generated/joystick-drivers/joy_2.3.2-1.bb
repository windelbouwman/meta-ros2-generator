
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS2 driver for a generic Linux joystick. Will contain a MacOS and Windows version later. The joy package contains joy_node, a node that interfaces a generic Linux joystick to ROS2. This node publishes a "Joy" message, which contains the current state of each one of the joystick's buttons and axes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/joystick_drivers-release/archive/release/dashing/joy/2.3.2-1.zip;downloadfilename=joy_2.3.2-1.zip"
SRC_URI[md5sum] = "c6bc7eb3ac8e48224cfa6346068b85f6"
SRC_URI[sha256sum] = "ab41afa061a8aba9eae2980d395c053bd7ef3f381bc4bde066bf9a882cb0c63c"

S = "${WORKDIR}/joystick_drivers-release-release-dashing-joy-2.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

