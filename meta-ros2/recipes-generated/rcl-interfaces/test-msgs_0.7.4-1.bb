
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing message definitions and fixtures used exclusively for testing purposes."
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs builtin-interfaces test-interface-files"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs builtin-interfaces rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/test_msgs/0.7.4-1.zip;downloadfilename=test-msgs_0.7.4-1.zip"
SRC_URI[md5sum] = "87c77b9f8498dd1199b6e3ffcf8f0c28"
SRC_URI[sha256sum] = "6b74e93961a087734a36536766b4da3c7d1cfa3188c59354e3c7cf27807c382a"

S = "${WORKDIR}/rcl_interfaces-release-release-dashing-test_msgs-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

