
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


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui_app/1.0.6-1.zip;downloadfilename=qt-gui-app_1.0.6-1.zip"
SRC_URI[md5sum] = "d2ce8005c3f23e3ea59cb6e8350add8f"
SRC_URI[sha256sum] = "45a37dcd0a2d872903693e55807e5a464a6ca4255910826e897bc58560ad4431"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui_app-1.0.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

