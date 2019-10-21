
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS2 extensions and behaviours for py_trees. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "py-trees py-trees-ros-interfaces python3-setuptools rcl-interfaces rclpy ros2topic sensor-msgs std-msgs unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "py-trees py-trees-ros-interfaces rcl-interfaces rclpy ros2topic sensor-msgs std-msgs unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "py-trees py-trees-ros-interfaces rcl-interfaces rclpy ros2topic sensor-msgs std-msgs unique-identifier-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_ros-release/archive/release/dashing/py_trees_ros/1.2.1-2.zip;downloadfilename=py-trees-ros_1.2.1-2.zip"
SRC_URI[md5sum] = "29c59d3f9ffe6cb5a1e1e2731119e48b"
SRC_URI[sha256sum] = "5e2497257e2e7131eb509e516fe53ae0ef655e9d2fadc67d79feea2cbfa8af6b"

S = "${WORKDIR}/py_trees_ros-release-release-dashing-py_trees_ros-1.2.1-2"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

