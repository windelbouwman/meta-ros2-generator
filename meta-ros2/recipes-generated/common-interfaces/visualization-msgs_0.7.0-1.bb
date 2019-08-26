
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some visualization and interaction related message definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/visualization_msgs/0.7.0-1.zip;downloadfilename=visualization-msgs_0.7.0-1.zip"
SRC_URI[md5sum] = "04f455f051ebe1f98af00d9797443cfd"
SRC_URI[sha256sum] = "e3cf16c6095b49b76ed4db984637a2283e8127c36f4d4d78a0a1bc6a14003edf"

S = "${WORKDIR}/common_interfaces-release-release-dashing-visualization_msgs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

