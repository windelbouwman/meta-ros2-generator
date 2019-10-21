
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROS2 version of the robot_state_publisher package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs kdl-parser orocos-kdl rclcpp sensor-msgs tf2-ros urdf urdfdom-headers"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs kdl-parser orocos-kdl rclcpp sensor-msgs tf2-ros urdf urdfdom-headers"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/robot_state_publisher-release/archive/release/dashing/robot_state_publisher/2.2.4-1.zip;downloadfilename=robot-state-publisher_2.2.4-1.zip"
SRC_URI[md5sum] = "757c4d7146c1cb665b5cd59c07b8e0d4"
SRC_URI[sha256sum] = "7551a99e3e80805f08bd63f77f8a0cc3af2ccb7de7a1ca18758aba645cfbd3ce"

S = "${WORKDIR}/robot_state_publisher-release-release-dashing-robot_state_publisher-2.2.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

