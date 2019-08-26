
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Instrumentation library for real-time performance testing"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/dashing/rttest/0.7.1-1.zip;downloadfilename=rttest_0.7.1-1.zip"
SRC_URI[md5sum] = "4e774f5457fd3c541a1feaa706932509"
SRC_URI[sha256sum] = "23a9349e724b59872d55d7933507289fc0a3f68b186f59e59851bf3c32b8256a"

S = "${WORKDIR}/realtime_support-release-release-dashing-rttest-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

