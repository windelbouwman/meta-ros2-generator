
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " A Qt-JS application for visualisation of executing/log-replayed behaviour trees in a ROS2 ecosystem. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "pyqt5-dev-tools python3-setuptools qttools5-dev-tools"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "py-trees-js py-trees-ros-interfaces python3-pyqt5.qtwebengine python3-qt5-bindings rclpy unique-identifier-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_ros_viewer-release/archive/release/dashing/py_trees_ros_viewer/0.1.3-1.zip;downloadfilename=py-trees-ros-viewer_0.1.3-1.zip"
SRC_URI[md5sum] = "2655044da933c79503aa0c30ff439e19"
SRC_URI[sha256sum] = "1af5e3c75cf797ba8e5d7a9fc540a2acd18de105ebbdc72b8114d85536901129"

S = "${WORKDIR}/py_trees_ros_viewer-release-release-dashing-py_trees_ros_viewer-0.1.3-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

