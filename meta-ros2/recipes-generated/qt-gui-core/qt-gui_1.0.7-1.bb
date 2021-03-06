
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " qt_gui provides the infrastructure for an integrated graphical user interface based on Qt. It is extensible with Python- and C++-based plugins (implemented in separate packages) which can contribute arbitrary widgets. It requires either PyQt or PySide bindings. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "python3-qt5-bindings qt5-qmake"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding python3-catkin-pkg-modules tango-icon-theme"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui/1.0.7-1.zip;downloadfilename=qt-gui_1.0.7-1.zip"
SRC_URI[md5sum] = "c62a1c712a60866b640d97f7d7bf7649"
SRC_URI[sha256sum] = "9c5dab81605b1931fb34292b990d7235ac9fad3325c0009cab8f671a18bc2d89"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui-1.0.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

