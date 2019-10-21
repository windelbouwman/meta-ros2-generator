
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " tf2 is the second generation of the transform library, which lets the user keep track of multiple coordinate frames over time. tf2 maintains the relationship between coordinate frames in a tree structure buffered in time, and lets the user transform points, vectors, etc between any two coordinate frames at any desired point in time. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "console-bridge-vendor geometry-msgs libconsole-bridge-dev"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "console-bridge-vendor geometry-msgs libconsole-bridge-dev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "console-bridge-vendor geometry-msgs libconsole-bridge-dev"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2/0.11.5-1.zip;downloadfilename=tf2_0.11.5-1.zip"
SRC_URI[md5sum] = "9db1eb16d1f28ca383dd0e185f0f69ca"
SRC_URI[sha256sum] = "8140e8cef9f822a0de55324cd624d092443cbc063b32c5c8f208df382e65b2f0"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2-0.11.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

