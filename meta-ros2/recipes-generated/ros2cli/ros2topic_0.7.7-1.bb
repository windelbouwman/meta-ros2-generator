
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The topic command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-numpy python3-yaml rclpy ros2cli ros2msg rosidl-runtime-py"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2topic/0.7.7-1.zip;downloadfilename=ros2topic_0.7.7-1.zip"
SRC_URI[md5sum] = "6de28a13a808b1f2ce00f7e22500fcca"
SRC_URI[sha256sum] = "0f2535cc880e00e75f5d8b8216538105528619fed96aed145bd5aad55d74360a"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2topic-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

