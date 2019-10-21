
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


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/costmap_queue/0.2.6-1.zip;downloadfilename=costmap-queue_0.2.6-1.zip"
SRC_URI[md5sum] = "3ff5960556d7849189918efed7d29990"
SRC_URI[sha256sum] = "2bec96908f18b00d9001fd8c5465f8badec42d1c6085ea0aa36ef435cc3b9f3e"

S = "${WORKDIR}/navigation2-release-release-dashing-costmap_queue-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

