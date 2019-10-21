
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "dwb-msgs geometry-msgs nav-2d-msgs nav-2d-utils nav-msgs nav2-common nav2-costmap-2d nav2-util pluginlib rclcpp sensor-msgs std-msgs tf2-ros visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "dwb-msgs geometry-msgs nav-2d-utils nav-msgs nav2-costmap-2d nav2-util pluginlib rclcpp rclcpp std-msgs std-msgs tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_core/0.2.6-1.zip;downloadfilename=dwb-core_0.2.6-1.zip"
SRC_URI[md5sum] = "64951b108275f66afbb24348dc7c7f94"
SRC_URI[sha256sum] = "67b1dd1746ee33dbf23adceeb0d1dd0244879d227d9e973c31b62ed63a0179a0"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_core-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

