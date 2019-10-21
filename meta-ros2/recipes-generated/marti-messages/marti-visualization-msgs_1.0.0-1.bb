
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  marti_visualization_msgs  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces geometry-msgs sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-runtime sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_visualization_msgs/1.0.0-1.zip;downloadfilename=marti-visualization-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "db256a6e6774af6c37e3536fca5c4993"
SRC_URI[sha256sum] = "af9dcd7970ac78ca46e7d9bfb88efc34067540dd67fa3e2022925e0010f4e1f9"

S = "${WORKDIR}/marti_messages-release-release-dashing-marti_visualization_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

