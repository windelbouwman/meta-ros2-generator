
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical user interface provided by qt_gui."
SECTION = "devel"

ROS_BUILD_DEPENDS = "qt-gui"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding python3-catkin-pkg-modules qt-gui rclpy"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_gui/1.0.4-1.zip;downloadfilename=rqt-gui_1.0.4-1.zip"
SRC_URI[md5sum] = "e2ef1ccce48711a50a0bd191ffafd2cd"
SRC_URI[sha256sum] = "345a0e10e43b8d8c8b20ed68577dc516e7570ec27ab198558d7b75c61f8c672e"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_gui-1.0.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

