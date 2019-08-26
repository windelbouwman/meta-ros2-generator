
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing realsense camera messages definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2_intel_realsense-release/archive/release/dashing/realsense_camera_msgs/2.0.4-2.zip;downloadfilename=realsense-camera-msgs_2.0.4-2.zip"
SRC_URI[md5sum] = "06998c120be3864253e1bb85269c3cce"
SRC_URI[sha256sum] = "60e90dbc64d6d372bc43281761ff101b8be567983747a5cbf3db08d5ac287ee9"

S = "${WORKDIR}/ros2_intel_realsense-release-release-dashing-realsense_camera_msgs-2.0.4-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

