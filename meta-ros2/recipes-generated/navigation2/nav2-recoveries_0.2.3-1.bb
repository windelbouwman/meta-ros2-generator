
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_recoveries/0.2.3-1.zip;downloadfilename=nav2-recoveries_0.2.3-1.zip"
SRC_URI[md5sum] = "1a2e3326f062fbec10423ce0db4e19af"
SRC_URI[sha256sum] = "5a65929023e7d7f61429d9ebc11d93b785942b62141bb4a5dfe33db3f6c0db68"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_recoveries-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

