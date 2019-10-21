
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  Holds the action description and relevant messages for the move_base package.  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs geometry-msgs rosidl-default-generators"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs geometry-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"


SRC_URI = "https://github.com/ros2-gbp/navigation_msgs-release/archive/release/dashing/move_base_msgs/2.0.2-1.zip;downloadfilename=move-base-msgs_2.0.2-1.zip"
SRC_URI[md5sum] = "b2b83d09c9abe5a9506ec3c895b0d485"
SRC_URI[sha256sum] = "bcfb8f13d2aa6a4c1e98ecdfd5e444ce6128d79ce6c63b4f019aabc640e40e40"

S = "${WORKDIR}/navigation_msgs-release-release-dashing-move_base_msgs-2.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

