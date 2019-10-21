
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "GPS routines for use in GPS drivers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "gps-msgs nav-msgs rclcpp rclcpp-components rclpy sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native ament-cmake-python-native"
ROS_BUILD_EXPORT_DEPENDS = "gps-msgs nav-msgs rclcpp rclcpp-components rclpy sensor-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gps-msgs nav-msgs rclcpp rclcpp-components rclpy sensor-msgs std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/dashing/gps_tools/1.0.0-1.zip;downloadfilename=gps-tools_1.0.0-1.zip"
SRC_URI[md5sum] = "c2b6e67d1920d4ccd6b9e452f8702b2e"
SRC_URI[sha256sum] = "0b6a45b8b9a174093bf97e8635b6144aa487a49e2c28dcc093145e5aa44df394"

S = "${WORKDIR}/gps_umd-release-release-dashing-gps_tools-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

