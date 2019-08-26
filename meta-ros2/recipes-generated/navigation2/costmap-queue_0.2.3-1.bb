
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The costmap_queue package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "nav2-common nav2-costmap-2d rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "nav2-costmap-2d rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "nav2-costmap-2d rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/costmap_queue/0.2.3-1.zip;downloadfilename=costmap-queue_0.2.3-1.zip"
SRC_URI[md5sum] = "c49cdeed00990161fcacb1a5484f4f5d"
SRC_URI[sha256sum] = "0f79f57985a9349a3a400f2088f14eb4a1b57468f889bade1d26cb9bb262222d"

S = "${WORKDIR}/navigation2-release-release-dashing-costmap_queue-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

