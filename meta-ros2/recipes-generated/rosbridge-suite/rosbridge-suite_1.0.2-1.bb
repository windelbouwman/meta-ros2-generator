
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Rosbridge provides a JSON API to ROS functionality for non-ROS programs. There are a variety of front ends that interface with rosbridge, including a WebSocket server for web browsers to interact with.  Rosbridge_suite is a meta-package containing rosbridge, various front end packages for rosbridge like a WebSocket package, and helper packages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosapi rosbridge-library rosbridge-server"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rosbridge_suite-release/archive/release/dashing/rosbridge_suite/1.0.2-1.zip;downloadfilename=rosbridge-suite_1.0.2-1.zip"
SRC_URI[md5sum] = "a39531c509228ebb43f9a25529b20b0d"
SRC_URI[sha256sum] = "4746a9baa2c04b06d8fc3a8554a83716a992649746e057e9698831865ed5d2a8"

S = "${WORKDIR}/rosbridge_suite-release-release-dashing-rosbridge_suite-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

