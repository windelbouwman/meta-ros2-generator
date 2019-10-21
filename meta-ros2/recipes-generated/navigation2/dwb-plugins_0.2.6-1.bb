
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Standard implementations of the GoalChecker and TrajectoryGenerators for dwb_core "
SECTION = "devel"

ROS_BUILD_DEPENDS = "angles dwb-core nav-2d-msgs nav-2d-utils nav2-common nav2-util pluginlib rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "angles dwb-core nav-2d-msgs nav-2d-utils nav2-util pluginlib rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "angles dwb-core nav-2d-msgs nav-2d-utils nav2-util pluginlib rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_plugins/0.2.6-1.zip;downloadfilename=dwb-plugins_0.2.6-1.zip"
SRC_URI[md5sum] = "1a3263d5e3b0badbdc8a802e1a32fb49"
SRC_URI[sha256sum] = "139c50a2f3705cd33907cc9c510a610e0f4934598c2b08299a9d39559e73792e"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_plugins-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

