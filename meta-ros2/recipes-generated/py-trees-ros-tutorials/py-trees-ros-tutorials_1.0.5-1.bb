
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS2 extensions and behaviours for py_trees. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "pyqt5-dev-tools python3-setuptools qttools5-dev-tools"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs geometry-msgs launch launch-ros py-trees py-trees py-trees-ros py-trees-ros py-trees-ros-interfaces py-trees-ros-interfaces python3-qt5-bindings rcl-interfaces rcl-interfaces rclpy rclpy ros2launch ros2param ros2run ros2service ros2topic sensor-msgs std-msgs std-msgs"
ROS_TEST_DEPENDS = "action-msgs py-trees py-trees-ros rclpy"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_ros_tutorials-release/archive/release/dashing/py_trees_ros_tutorials/1.0.5-1.zip;downloadfilename=py-trees-ros-tutorials_1.0.5-1.zip"
SRC_URI[md5sum] = "425c27679afbef3b83e2e78bec04dfa2"
SRC_URI[sha256sum] = "d3b82fa6e2b3c208f7a53238e6df23c764fad5d0118094265e4450ccc01fa8ca"

S = "${WORKDIR}/py_trees_ros_tutorials-release-release-dashing-py_trees_ros_tutorials-1.0.5-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

