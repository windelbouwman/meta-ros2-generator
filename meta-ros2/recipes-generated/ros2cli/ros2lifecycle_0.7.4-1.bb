
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


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2lifecycle/0.7.4-1.zip;downloadfilename=ros2lifecycle_0.7.4-1.zip"
SRC_URI[md5sum] = "8fff7269b0c05bf6db199cf4039f68ca"
SRC_URI[sha256sum] = "3c852bed4ac04b4ebb2c799ac4ed0110dabd1389701e1c8a1f4cea00a3507c27"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2lifecycle-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

