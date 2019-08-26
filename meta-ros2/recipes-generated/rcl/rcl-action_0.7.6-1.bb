
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


SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl_action/0.7.6-1.zip;downloadfilename=rcl-action_0.7.6-1.zip"
SRC_URI[md5sum] = "4169f8d24d70dd739eae69e741eed72f"
SRC_URI[sha256sum] = "f8e26b8c0e981af3817ede83de82c9c88088f1c6798f0d2c86893e8efacd97bb"

S = "${WORKDIR}/rcl-release-release-dashing-rcl_action-0.7.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

