
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The service command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-yaml rclpy ros2cli ros2srv rosidl-runtime-py"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2service/0.7.7-1.zip;downloadfilename=ros2service_0.7.7-1.zip"
SRC_URI[md5sum] = "1ceb239d355d567a4654b3dc75471ae6"
SRC_URI[sha256sum] = "a30c38215781bfac96143a44a487713a4b85d3d6368c62479bcf6fb209418728"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2service-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

