
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


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2topic/0.7.4-1.zip;downloadfilename=ros2topic_0.7.4-1.zip"
SRC_URI[md5sum] = "355473ce3810addb8eb9cf5adaf49a06"
SRC_URI[sha256sum] = "9fe473822772d2c4d74d14beee8c5902178cb69d21d4291200817d2c58e4bf1e"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2topic-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

