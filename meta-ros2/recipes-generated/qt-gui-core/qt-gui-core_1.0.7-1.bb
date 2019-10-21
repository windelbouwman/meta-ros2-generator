
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Integration of the ROS package system and ROS-specific plugins for a Qt-based GUI. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui_core/1.0.7-1.zip;downloadfilename=qt-gui-core_1.0.7-1.zip"
SRC_URI[md5sum] = "42d1684b8cadd6752d3bce73d57c3cf6"
SRC_URI[sha256sum] = "780159a288dfed25f90c6cbac68b0832ed2fdb1cb1f2f4da92133ee24686648d"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui_core-1.0.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

