
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The launch command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-python launch launch-ros ros2cli ros2pkg"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ament-index-python launch launch-ros ros2cli ros2pkg"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python launch launch-ros ros2cli ros2pkg"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/launch_ros-release/archive/release/dashing/ros2launch/0.8.7-1.zip;downloadfilename=ros2launch_0.8.7-1.zip"
SRC_URI[md5sum] = "51c66a5b7d874ed6d21d0e7dd89a1f30"
SRC_URI[sha256sum] = "c229cf09b50562e11f7aa56f6542b95719a3ec37dcf0cc3695604b1f38d0e3ec"

S = "${WORKDIR}/launch_ros-release-release-dashing-ros2launch-0.8.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

