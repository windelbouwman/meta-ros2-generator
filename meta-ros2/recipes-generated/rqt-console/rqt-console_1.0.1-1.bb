
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


SRC_URI = "https://github.com/ros2-gbp/rqt_console-release/archive/release/dashing/rqt_console/1.0.1-1.zip;downloadfilename=rqt-console_1.0.1-1.zip"
SRC_URI[md5sum] = "b1e77372320aa655b36f4e27340dfbe5"
SRC_URI[sha256sum] = "248f6a5be9f7e96abf84975a9e5e84803e9f60cdcd3033e8a6f9cdd9d5257554"

S = "${WORKDIR}/rqt_console-release-release-dashing-rqt_console-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

