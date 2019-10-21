
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides a sped up improved slam karto with updated SDK and visualization and modification toolsets "
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost builtin-interfaces eigen libceres-dev liblapack-dev libqt5-core libqt5-widgets message-filters nav-msgs nav2-map-server pluginlib qtbase5-dev rclcpp rosidl-default-generators rviz-common rviz-default-plugins rviz-rendering sensor-msgs std-msgs std-srvs suitesparse tbb tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "boost builtin-interfaces eigen libceres-dev liblapack-dev libqt5-core libqt5-widgets message-filters nav-msgs nav2-map-server pluginlib rclcpp rosidl-default-generators rviz-common rviz-default-plugins rviz-rendering sensor-msgs std-msgs std-srvs suitesparse tbb tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"


SRC_URI = "https://github.com/SteveMacenski/slam_toolbox-release/archive/release/dashing/slam_toolbox/2.0.2-1.zip;downloadfilename=slam-toolbox_2.0.2-1.zip"
SRC_URI[md5sum] = "489cf022e474ba6cc71eff98792e905b"
SRC_URI[sha256sum] = "3a532abbc2bbe1780aa828e9defa8b9dadc0f34c9c89f82f3bac1f6668900da9"

S = "${WORKDIR}/slam_toolbox-release-release-dashing-slam_toolbox-2.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

