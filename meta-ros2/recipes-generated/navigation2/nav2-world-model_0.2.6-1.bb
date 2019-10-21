
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "nav2-common nav2-costmap-2d nav2-msgs nav2-util rclcpp tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "nav2-costmap-2d nav2-msgs nav2-util rclcpp tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_world_model/0.2.6-1.zip;downloadfilename=nav2-world-model_0.2.6-1.zip"
SRC_URI[md5sum] = "24e66aa2999e0a2bf08fbaf5f537f0e3"
SRC_URI[sha256sum] = "3b13af01969bba5a422dfe1573004c0850ce5349b002ecb30e106d38d887ef98"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_world_model-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

