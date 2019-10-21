
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " qt_gui_cpp provides the foundation for C++-bindings for qt_gui and creates bindings for every generator available. At least one specific binding must be available in order to use C++-plugins. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "pkg-config pluginlib python-qt-binding qt5-qmake qtbase5-dev tinyxml2-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pluginlib qt-gui tinyxml2-vendor"
ROS_TEST_DEPENDS = "ament-cmake-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_gui_cpp/1.0.7-1.zip;downloadfilename=qt-gui-cpp_1.0.7-1.zip"
SRC_URI[md5sum] = "f6bd5270df41f2921264e98b5362c170"
SRC_URI[sha256sum] = "8b292f8c6c3d0259302d1c4f91a69e7e5f5746fde21835eeeb657c5a0ed15de5"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_gui_cpp-1.0.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

