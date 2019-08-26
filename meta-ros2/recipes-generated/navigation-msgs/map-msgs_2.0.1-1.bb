
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package defines messages commonly used in mapping packages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "nav-msgs sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "nav-msgs rosidl-default-runtime sensor-msgs std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"


SRC_URI = "https://github.com/ros2-gbp/navigation_msgs-release/archive/release/dashing/map_msgs/2.0.1-1.zip;downloadfilename=map-msgs_2.0.1-1.zip"
SRC_URI[md5sum] = "f87a70b8ca457bfeff04e494f40b543b"
SRC_URI[sha256sum] = "89cd75e9a029670b0e084fbdb5403a1586f5ac680a5f6f73e0ff246674555d98"

S = "${WORKDIR}/navigation_msgs-release-release-dashing-map_msgs-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

