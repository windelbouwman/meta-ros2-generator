
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A controller/manager for the lifecycle nodes of the Navigation 2 system"
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs lifecycle-msgs nav2-common nav2-msgs nav2-util rclcpp-action rclcpp-lifecycle std-msgs std-srvs tf2-geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs lifecycle-msgs nav2-msgs nav2-util rclcpp-action rclcpp-lifecycle std-msgs std-srvs tf2-geometry-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_lifecycle_manager/0.2.6-1.zip;downloadfilename=nav2-lifecycle-manager_0.2.6-1.zip"
SRC_URI[md5sum] = "d777c5b6852e592b65883e4b3296fd49"
SRC_URI[sha256sum] = "7cd7dae73995a2c8e3c828b3caae7ae4aae7bc507a93df5de3bd49573cfc96eb"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_lifecycle_manager-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

