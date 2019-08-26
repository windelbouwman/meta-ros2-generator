
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Refactored map server for ROS2 Navigation "
SECTION = "devel"

ROS_BUILD_DEPENDS = "launch-ros launch-testing nav-msgs nav2-common nav2-util rclcpp rclcpp-lifecycle sdl sdl-image std-msgs tf2 yaml-cpp-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "launch-ros launch-testing nav-msgs nav2-util rclcpp rclcpp-lifecycle sdl sdl-image std-msgs tf2 yaml-cpp-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch-ros launch-testing nav-msgs nav2-util rclcpp rclcpp-lifecycle sdl sdl-image std-msgs tf2 yaml-cpp-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_map_server/0.2.3-1.zip;downloadfilename=nav2-map-server_0.2.3-1.zip"
SRC_URI[md5sum] = "ea06bf87b3795cdf64c75e6590c64c14"
SRC_URI[sha256sum] = "987691cc5061223621139f72d1a644a9bc9fd66abdae348170956fbf9cbc4a99"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_map_server-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

