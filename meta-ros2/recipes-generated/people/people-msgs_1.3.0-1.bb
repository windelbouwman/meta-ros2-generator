
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Messages used by nodes in the people stack."
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/OSUrobotics/people-ros2-release/archive/release/dashing/people_msgs/1.3.0-1.zip;downloadfilename=people-msgs_1.3.0-1.zip"
SRC_URI[md5sum] = "c9860cc82e48afee74687808d8a166aa"
SRC_URI[sha256sum] = "15547925c3b63ec30e8ede40c1f821c89c3dcee2354edaebb4642c480b99512f"

S = "${WORKDIR}/people-release-release-dashing-people_msgs-1.3.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

