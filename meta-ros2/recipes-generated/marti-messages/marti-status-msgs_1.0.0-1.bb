
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  marti_status_msgs  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_status_msgs/1.0.0-1.zip;downloadfilename=marti-status-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "92c400a5161b0baaaf80f990c4a4f96e"
SRC_URI[sha256sum] = "3ce9833c1f9cf9d12efa86d5ca457f0701dc660232b15bc53ffb3a6fed34c1a2"

S = "${WORKDIR}/marti_messages-release-release-dashing-marti_status_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

