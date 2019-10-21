
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The dwb_critics package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "angles costmap-queue dwb-core geometry-msgs nav-2d-msgs nav-2d-utils nav2-common nav2-costmap-2d nav2-util pluginlib rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "angles costmap-queue dwb-core geometry-msgs nav-2d-msgs nav-2d-utils nav2-costmap-2d nav2-util pluginlib rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "angles costmap-queue dwb-core geometry-msgs nav-2d-msgs nav-2d-utils nav2-costmap-2d nav2-util pluginlib rclcpp sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_critics/0.2.6-1.zip;downloadfilename=dwb-critics_0.2.6-1.zip"
SRC_URI[md5sum] = "bbe94c4acf1f56fe2b7d325af6d62905"
SRC_URI[sha256sum] = "cef8a7f7690cdad3787bb7228b932f84ec54e8af59a1c97497a4e55b790c5218"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_critics-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

