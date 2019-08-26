
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS2 extensions and behaviours for py_trees. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "py-trees py-trees-ros-interfaces python3-setuptools rclpy ros2topic sensor-msgs std-msgs unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "py-trees py-trees-ros-interfaces rclpy ros2topic sensor-msgs std-msgs unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "py-trees py-trees-ros-interfaces rclpy ros2topic sensor-msgs std-msgs unique-identifier-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_ros-release/archive/release/dashing/py_trees_ros/1.1.2-1.zip;downloadfilename=py-trees-ros_1.1.2-1.zip"
SRC_URI[md5sum] = "e5d7c887bf25a5297d1bc44132721a85"
SRC_URI[sha256sum] = "cc6c6d208479d29cc33fac8caa0473b649a70a39fe4e3f2e375626b72323df4e"

S = "${WORKDIR}/py_trees_ros-release-release-dashing-py_trees_ros-1.1.2-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

