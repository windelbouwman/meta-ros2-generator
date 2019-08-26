
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "An rcl logger implementation that doesn't do anything with log messages."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcutils"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native python3-empy-native"
ROS_BUILD_EXPORT_DEPENDS = "rcutils"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rcutils"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_logging-release/archive/release/dashing/rcl_logging_noop/0.2.1-1.zip;downloadfilename=rcl-logging-noop_0.2.1-1.zip"
SRC_URI[md5sum] = "90f24ca50099c1b55f689e73bd61ad63"
SRC_URI[sha256sum] = "2c704b4d6d4481a750f93256066228dc8051df1e73aa26aa196f43922c6eb37c"

S = "${WORKDIR}/rcl_logging-release-release-dashing-rcl_logging_noop-0.2.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

