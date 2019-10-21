
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A (to be) generic joystick interface to control a robot"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "control-msgs rclpy sensor-msgs teleop-tools-msgs trajectory-msgs"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/dashing/joy_teleop/1.0.1-0.zip;downloadfilename=joy-teleop_1.0.1-0.zip"
SRC_URI[md5sum] = "c1c85f2255fc36d68060fb1882228ff5"
SRC_URI[sha256sum] = "cb9464cc31ebfd3af371fe9cdc0614cd1ec76b926b514b1f06d9e5ddcba9a4bc"

S = "${WORKDIR}/teleop_tools-release-release-dashing-joy_teleop-1.0.1-0"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

