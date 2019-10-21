
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " KDL binding for tf2 "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest rclcpp tf2-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_kdl/0.11.5-1.zip;downloadfilename=tf2-kdl_0.11.5-1.zip"
SRC_URI[md5sum] = "f280c314a885c6fec5e4b087dc8443bb"
SRC_URI[sha256sum] = "a3f23eb88b7eb2bea4198808c6798449e8c31b2fe9fa9f5904c381641465a531"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_kdl-0.11.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

