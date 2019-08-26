
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_plugins/0.2.3-1.zip;downloadfilename=dwb-plugins_0.2.3-1.zip"
SRC_URI[md5sum] = "80d70f36f53cdac925a99c85ca04dc6e"
SRC_URI[sha256sum] = "909139846e8cf9dc133777a17a820c51a492636cc10d37e5fd76fa83b713943f"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_plugins-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

