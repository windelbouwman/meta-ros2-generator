
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " TurtleBot3 driver node that include diff drive controller, odometry and tf node "
SECTION = "devel"

ROS_BUILD_DEPENDS = "dynamixel-sdk geometry-msgs message-filters nav-msgs rclcpp rcutils sensor-msgs std-msgs std-srvs tf2 tf2-ros turtlebot3-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "dynamixel-sdk geometry-msgs message-filters nav-msgs rclcpp rcutils sensor-msgs std-msgs std-srvs tf2 tf2-ros turtlebot3-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "dynamixel-sdk geometry-msgs message-filters nav-msgs rclcpp rcutils sensor-msgs std-msgs std-srvs tf2 tf2-ros turtlebot3-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_node/2.0.1-1.zip;downloadfilename=turtlebot3-node_2.0.1-1.zip"
SRC_URI[md5sum] = "720767b4b4f1c2044f97198b036a97e5"
SRC_URI[sha256sum] = "ad444b37611e4b077fcddcfa7c392434cf74fe5409b940aa68852cec34c7ad81"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3_node-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

