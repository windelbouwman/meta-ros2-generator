
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "C API providing common interface to a shared library wrapping 3rd party loggers."
SECTION = "devel"

ROS_BUILD_DEPENDS = "log4cxx rcutils"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native python3-empy-native"
ROS_BUILD_EXPORT_DEPENDS = "log4cxx rcutils"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "log4cxx rcutils"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_logging-release/archive/release/dashing/rcl_logging_log4cxx/0.2.1-1.zip;downloadfilename=rcl-logging-log4cxx_0.2.1-1.zip"
SRC_URI[md5sum] = "1279a8ee04718d09b3cf4f5c34036c74"
SRC_URI[sha256sum] = "ec27b770482efe3b97642c09748934705596a13380a2088c6cc5335612249e1f"

S = "${WORKDIR}/rcl_logging-release-release-dashing-rcl_logging_log4cxx-0.2.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

