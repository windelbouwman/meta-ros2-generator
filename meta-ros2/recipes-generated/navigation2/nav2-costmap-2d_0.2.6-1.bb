
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides an implementation of a 2D costmap that takes in sensor data from the world, builds a 2D or 3D occupancy grid of the data (depending on whether a voxel based implementation is used), and inflates costs in a 2D costmap based on the occupancy grid and a user specified inflation radius. This package also provides support for map_server based initialization of a costmap, rolling window based costmaps, and parameter based subscription to and configuration of sensor topics. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs laser-geometry map-msgs message-filters nav-msgs nav2-common nav2-msgs nav2-util nav2-voxel-grid pluginlib rclcpp rclcpp-lifecycle sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs laser-geometry map-msgs message-filters nav-msgs nav2-msgs nav2-util nav2-voxel-grid pluginlib rclcpp rclcpp-lifecycle sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs laser-geometry map-msgs message-filters nav-msgs nav2-msgs nav2-util nav2-voxel-grid pluginlib rclcpp rclcpp-lifecycle sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tf2-sensor-msgs visualization-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing nav2-lifecycle-manager nav2-map-server"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_costmap_2d/0.2.6-1.zip;downloadfilename=nav2-costmap-2d_0.2.6-1.zip"
SRC_URI[md5sum] = "57f373eba1ef269be817af123eeebf23"
SRC_URI[sha256sum] = "8d705eef0fa8cbe933779c22a9596bee766e009ba2f6ea040f1f7a0b59fcde88"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_costmap_2d-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

