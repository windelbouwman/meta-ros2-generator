
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The action command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs ament-index-python rclpy ros2cli rosidl-runtime-py"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2action/0.7.7-1.zip;downloadfilename=ros2action_0.7.7-1.zip"
SRC_URI[md5sum] = "b196dc139c1b0ad965607cc555c88881"
SRC_URI[sha256sum] = "b67a477e87d9d2888f5b2b03a942e2538d4b3f30cd073dc8bc9386e4f3d95c9f"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2action-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

