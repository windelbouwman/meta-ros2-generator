
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " qt_gui_py_common provides common functionality for GUI plugins written in Python. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui_py_common/1.0.7-1.zip;downloadfilename=qt-gui-py-common_1.0.7-1.zip"
SRC_URI[md5sum] = "04598c2976913c65e7ba4aa8b453523b"
SRC_URI[sha256sum] = "ff907208b3e50d07db5b5b76e6c18db1a8274ba75cad9b36118d05ae8ba42ea0"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui_py_common-1.0.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

