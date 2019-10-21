
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The core rosbridge package, repsonsible for interpreting JSON andperforming the appropriate ROS action, like subscribe, publish, call service, and interact with params. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs python3-bson python3-pil rosidl-default-generators std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs python3-bson python3-pil rclpy rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rosbridge_suite-release/archive/release/dashing/rosbridge_library/1.0.2-1.zip;downloadfilename=rosbridge-library_1.0.2-1.zip"
SRC_URI[md5sum] = "955473108415d0bb6be44e9a207d9b57"
SRC_URI[sha256sum] = "62584387473966e4f6639020291958ec9f22c396b5d7d21aa65f28f979024f1c"

S = "${WORKDIR}/rosbridge_suite-release-release-dashing-rosbridge_library-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

