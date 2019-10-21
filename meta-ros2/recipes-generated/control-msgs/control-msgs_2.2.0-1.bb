
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " control_msgs contains base messages and actions useful for controlling robots.  It provides representations for controller setpoints and joint and cartesian trajectories. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs builtin-interfaces geometry-msgs std-msgs trajectory-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs geometry-msgs std-msgs trajectory-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs builtin-interfaces geometry-msgs rosidl-default-runtime std-msgs trajectory-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/dashing/control_msgs/2.2.0-1.zip;downloadfilename=control-msgs_2.2.0-1.zip"
SRC_URI[md5sum] = "12bc6422647c8aac54b4473c5d61cf0b"
SRC_URI[sha256sum] = "7a03425c8b74b7bd26282fd8e9b0fd1f12eafd99c7cfe3e76e50a8df07649c0c"

S = "${WORKDIR}/control_msgs-release-release-dashing-control_msgs-2.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

