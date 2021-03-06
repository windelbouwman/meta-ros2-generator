
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ROS client library common implementation. This package contains an API which builds on the ROS middleware API and is optionally built upon by the other ROS client libraries. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcl-interfaces rcl-logging-noop rcutils rmw-implementation rosidl-generator-c tinydir-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "rcl-interfaces rcl-logging-noop rcutils rmw rmw-implementation rosidl-generator-c tinydir-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake rcl-interfaces rcl-logging-noop rcutils rmw-implementation rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake osrf-testing-tools-cpp rmw rmw-implementation-cmake test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl/0.7.7-1.zip;downloadfilename=rcl_0.7.7-1.zip"
SRC_URI[md5sum] = "ff88cf0387a69688c1fa28414b781060"
SRC_URI[sha256sum] = "139a227427427aa169feb291d7fb91e73ec160cf899cd5f736ef58b898533ea5"

S = "${WORKDIR}/rcl-release-release-dashing-rcl-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

