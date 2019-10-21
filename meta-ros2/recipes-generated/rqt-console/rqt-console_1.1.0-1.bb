
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_console provides a GUI plugin for displaying and filtering ROS messages."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding rcl-interfaces rclpy rqt-gui rqt-gui-py rqt-py-common"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_console-release/archive/release/dashing/rqt_console/1.1.0-1.zip;downloadfilename=rqt-console_1.1.0-1.zip"
SRC_URI[md5sum] = "e53ef6096e158950e4d3ecc489278da4"
SRC_URI[sha256sum] = "cb48611100b3b3b15ab237f09c67edc8d970add2e47415a4f3ce7fbcce68ba01"

S = "${WORKDIR}/rqt_console-release-release-dashing-rqt_console-1.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

