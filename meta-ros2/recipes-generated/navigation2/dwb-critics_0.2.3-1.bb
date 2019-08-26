
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_critics/0.2.3-1.zip;downloadfilename=dwb-critics_0.2.3-1.zip"
SRC_URI[md5sum] = "dbeb023fe977aef49eca2f3f3c9f460e"
SRC_URI[sha256sum] = "a2e36035b6db0949d10484d1f41dbb67597f74e60c849bc13c6b24d06e069b07"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_critics-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

