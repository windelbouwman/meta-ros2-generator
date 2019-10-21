
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Server Side tools for Authorization and Authentication of ROS Clients"
SECTION = "devel"

ROS_BUILD_DEPENDS = "libssl-dev rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rosauth-release/archive/release/dashing/rosauth/2.0.1-1.zip;downloadfilename=rosauth_2.0.1-1.zip"
SRC_URI[md5sum] = "3fb77e427a642c8519db9e23d6f45d08"
SRC_URI[sha256sum] = "7a191f93d5cf357cadb7b7ea1b04058f9b10a1a0842b96c5b9a6b25f95be279e"

S = "${WORKDIR}/rosauth-release-release-dashing-rosauth-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

