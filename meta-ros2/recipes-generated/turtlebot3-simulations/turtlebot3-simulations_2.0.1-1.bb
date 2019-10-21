
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS 2 packages for TurtleBot3 simulations "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "turtlebot3-gazebo"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3_simulations-release/archive/release/dashing/turtlebot3_simulations/2.0.1-1.zip;downloadfilename=turtlebot3-simulations_2.0.1-1.zip"
SRC_URI[md5sum] = "500d5a62c692cf5f705d7a0ba4620912"
SRC_URI[sha256sum] = "f65e022a860498881f7112541df9b051b8f767f3a9a3ef522841d2d836304d89"

S = "${WORKDIR}/turtlebot3_simulations-release-release-dashing-turtlebot3_simulations-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

