
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Command line tools for managing SROS2 keys"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "rclpy ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "openssl python3-lxml rclpy ros2cli"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/dashing/sros2/0.7.1-1.zip;downloadfilename=sros2_0.7.1-1.zip"
SRC_URI[md5sum] = "95a3f7cf173229e5a15fb18e0013a91e"
SRC_URI[sha256sum] = "00bf55ef1ce8fd145fe2bea666e6abd6343f12e5412a6384870d375464e8ea0a"

S = "${WORKDIR}/sros2-release-release-dashing-sros2-0.7.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

