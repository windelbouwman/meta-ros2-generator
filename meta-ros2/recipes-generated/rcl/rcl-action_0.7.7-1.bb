
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing a C-based ROS action implementation"
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs rcl rcutils rmw rosidl-generator-c"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs rcl rcutils rmw rosidl-generator-c"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common osrf-testing-tools-cpp test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl_action/0.7.7-1.zip;downloadfilename=rcl-action_0.7.7-1.zip"
SRC_URI[md5sum] = "26840a749914ac7d1fe7c716f9f89e52"
SRC_URI[sha256sum] = "7f379079981125445fe34d1b07f1474b6390fe6518a2f58b25964ae55425954f"

S = "${WORKDIR}/rcl-release-release-dashing-rcl_action-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

