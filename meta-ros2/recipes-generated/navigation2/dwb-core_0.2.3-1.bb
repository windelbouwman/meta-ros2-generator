
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_core/0.2.3-1.zip;downloadfilename=dwb-core_0.2.3-1.zip"
SRC_URI[md5sum] = "589f9779e12ce79ed8f8f0975f5b034b"
SRC_URI[sha256sum] = "67e8a97ec06bdf692cab95d9df3c374e6aaec4201603c03c8a7666d45289ac35"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_core-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

