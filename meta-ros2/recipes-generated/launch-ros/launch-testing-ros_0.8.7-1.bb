
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package providing utilities for writing ROS2 enabled launch tests."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch-ros launch-testing rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 demo-nodes-py python3-pytest std-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/launch_ros-release/archive/release/dashing/launch_testing_ros/0.8.7-1.zip;downloadfilename=launch-testing-ros_0.8.7-1.zip"
SRC_URI[md5sum] = "bd7a68256f231d7d085910379d523093"
SRC_URI[sha256sum] = "9978d690cd08ad780932f10765679584961b49162582dee6e41e3e0b6da06b6a"

S = "${WORKDIR}/launch_ros-release-release-dashing-launch_testing_ros-0.8.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

