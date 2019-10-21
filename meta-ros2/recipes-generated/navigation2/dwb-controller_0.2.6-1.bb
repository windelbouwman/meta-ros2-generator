
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "dwb-core nav-2d-msgs nav-2d-utils nav2-common nav2-msgs nav2-util rclcpp rclcpp-action std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "dwb-core nav-2d-msgs nav-2d-utils nav2-msgs nav2-util rclcpp rclcpp-action std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "dwb-core nav-2d-msgs nav-2d-utils nav2-msgs nav2-util rclcpp rclcpp-action std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_controller/0.2.6-1.zip;downloadfilename=dwb-controller_0.2.6-1.zip"
SRC_URI[md5sum] = "25349261c0edcadeb3b1307895b2cba3"
SRC_URI[sha256sum] = "03aeac6b63284150b63a112cbfcd4639abb1e0de75574f30c1be90991de1cb36"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_controller-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

