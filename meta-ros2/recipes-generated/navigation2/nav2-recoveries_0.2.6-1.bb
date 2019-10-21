
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs nav-msgs nav2-behavior-tree nav2-common nav2-costmap-2d nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle tf2 tf2-geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs nav-msgs nav2-behavior-tree nav2-costmap-2d nav2-msgs nav2-util rclcpp rclcpp-action rclcpp-lifecycle"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_recoveries/0.2.6-1.zip;downloadfilename=nav2-recoveries_0.2.6-1.zip"
SRC_URI[md5sum] = "c77e2591c19021afffe5fa31089ecafa"
SRC_URI[sha256sum] = "bb1b7fc07e9d3aa5c0ff55d063ffbeb868f2d9101ccffe69a793e1155a647d3d"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_recoveries-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

