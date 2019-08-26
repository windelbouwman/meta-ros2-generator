
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generic joystick teleop for twist robots."
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rclcpp sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/teleop_twist_joy-release/archive/release/dashing/teleop_twist_joy/2.2.0-1.zip;downloadfilename=teleop-twist-joy_2.2.0-1.zip"
SRC_URI[md5sum] = "e896485a3f18c137feb914a452c6882b"
SRC_URI[sha256sum] = "7939272dba2d87f73183cbbf83c74bdc2c1622cda56e11ce3131d21f917187ca"

S = "${WORKDIR}/teleop_twist_joy-release-release-dashing-teleop_twist_joy-2.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

