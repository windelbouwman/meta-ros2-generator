
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " rqt_py_common provides common functionality for rqt plugins written in Python. Despite no plugin is provided, this package is part of the rqt_common_plugins repository to keep refactoring generic functionality from these common plugins into this package as easy as possible.  Functionality included in this package should cover generic ROS concepts and should not introduce any special dependencies beside "ros_base". "
SECTION = "devel"

ROS_BUILD_DEPENDS = "qtbase5-dev rclpy"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "qtbase5-dev rclpy"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding qt-gui qtbase5-dev rclpy rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-cmake-pytest python-cmake-module"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_py_common/1.0.5-1.zip;downloadfilename=rqt-py-common_1.0.5-1.zip"
SRC_URI[md5sum] = "63824c0012be12a03d1e5d63e0c06292"
SRC_URI[sha256sum] = "115a0023d4ae15dce51ab82eb450fca9dbc42b03e738445d24c64b2407b0637c"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_py_common-1.0.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

