
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " qt_gui_app provides the main to start an instance of the integrated graphical user interface provided by qt_gui. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python qt-gui"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui_app/1.0.7-1.zip;downloadfilename=qt-gui-app_1.0.7-1.zip"
SRC_URI[md5sum] = "92924e181e6296821afa21403790852e"
SRC_URI[sha256sum] = "e24a70c197cd43ab1040dbb24f763c98b2a051dfa8c569021f6034d607ff2dcb"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui_app-1.0.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

