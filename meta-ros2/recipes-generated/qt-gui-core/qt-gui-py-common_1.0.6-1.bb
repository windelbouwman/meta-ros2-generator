
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


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui_py_common/1.0.6-1.zip;downloadfilename=qt-gui-py-common_1.0.6-1.zip"
SRC_URI[md5sum] = "a0fc06ae56812545235f3f02edb2dca3"
SRC_URI[sha256sum] = "3446bec6bbe7030435004e5580cb76932f772a46a9dba313177110654606b26a"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui_py_common-1.0.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

