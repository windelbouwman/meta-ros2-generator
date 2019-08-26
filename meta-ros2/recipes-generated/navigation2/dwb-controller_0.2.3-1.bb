
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/dwb_controller/0.2.3-1.zip;downloadfilename=dwb-controller_0.2.3-1.zip"
SRC_URI[md5sum] = "7318300f1e0cfbd01abfda696de40706"
SRC_URI[sha256sum] = "e38a815da208397e6b56ab730526e2dbcd38475892d7f2ef0e366d0d35b61e73"

S = "${WORKDIR}/navigation2-release-release-dashing-dwb_controller-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

