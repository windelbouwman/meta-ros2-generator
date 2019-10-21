
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Python and C++ interfaces for manipulating geodetic coordinates. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "angles geographic-msgs geometry-msgs python-catkin-pkg python-pyproj sensor-msgs unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "angles geographic-msgs geometry-msgs python-pyproj sensor-msgs unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "angles geographic-msgs geometry-msgs python-pyproj sensor-msgs unique-identifier-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/dashing/geodesy/1.0.1-1.zip;downloadfilename=geodesy_1.0.1-1.zip"
SRC_URI[md5sum] = "44d3fc9604d4a5ff50dac62ebbf45353"
SRC_URI[sha256sum] = "0b8bb05d71e5c6165764e04d74a6a022f2a6de7d5c91ecb02d55987d55a1118e"

S = "${WORKDIR}/geographic_info-release-release-dashing-geodesy-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

