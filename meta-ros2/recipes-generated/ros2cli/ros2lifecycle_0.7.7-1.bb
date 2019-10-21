
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The lifecycle command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "lifecycle-msgs rclpy ros2cli ros2node ros2service"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2lifecycle/0.7.7-1.zip;downloadfilename=ros2lifecycle_0.7.7-1.zip"
SRC_URI[md5sum] = "467979b85868a28a2e3150f463df7b67"
SRC_URI[sha256sum] = "a8eafea8a11163b8d9c77a363330596b4edd9a2ca4c246582d03c8688b53a832"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2lifecycle-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

