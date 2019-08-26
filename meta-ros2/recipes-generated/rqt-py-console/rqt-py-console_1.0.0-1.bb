
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_py_console is a Python GUI plugin providing an interactive Python console."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding qt-gui qt-gui-py-common rclpy rqt-gui rqt-gui-py"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_py_console-release/archive/release/dashing/rqt_py_console/1.0.0-1.zip;downloadfilename=rqt-py-console_1.0.0-1.zip"
SRC_URI[md5sum] = "63801b7d7486b2ea6f23eb59ac4f40b8"
SRC_URI[sha256sum] = "ba3ae99a6da870d381e43965f1d1d47e8ad0f41133f61968bbdd75a69a8de060"

S = "${WORKDIR}/rqt_py_console-release-release-dashing-rqt_py_console-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

