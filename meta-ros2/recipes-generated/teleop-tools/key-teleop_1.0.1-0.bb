
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A text-based interface to send a robot movement commands."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/dashing/key_teleop/1.0.1-0.zip;downloadfilename=key-teleop_1.0.1-0.zip"
SRC_URI[md5sum] = "8b840377263b37532bc2c3b6b0244919"
SRC_URI[sha256sum] = "e4b15b304bf28e40b496d6444828fe96b40dc5cf8b1ebafca04251f4c49ada74"

S = "${WORKDIR}/teleop_tools-release-release-dashing-key_teleop-1.0.1-0"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

