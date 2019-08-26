
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


SRC_URI = "https://github.com/stonier/py_trees_ros_tutorials-release/archive/release/dashing/py_trees_ros_tutorials/1.0.2-1.zip;downloadfilename=py-trees-ros-tutorials_1.0.2-1.zip"
SRC_URI[md5sum] = "e56223bfd226b42272519d14c2705491"
SRC_URI[sha256sum] = "22670b19e1e8cf919cd37fec1a039574812867ad1679b357e8128de88d5600f1"

S = "${WORKDIR}/py_trees_ros_tutorials-release-release-dashing-py_trees_ros_tutorials-1.0.2-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

