
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "TODO"
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs lifecycle-msgs nav-msgs nav2-common nav2-msgs rclcpp rclcpp-action rclcpp-lifecycle sdl sdl-image test-msgs tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs lifecycle-msgs nav-msgs nav2-msgs rclcpp rclcpp-action rclcpp-lifecycle sdl sdl-image tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing rclcpp-action rclcpp-lifecycle std-srvs test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_util/0.2.3-1.zip;downloadfilename=nav2-util_0.2.3-1.zip"
SRC_URI[md5sum] = "c9271fa44874c137f323291f8d39c121"
SRC_URI[sha256sum] = "b0e8596f770ea5d4154c9fe00d6527795b4183784f4752d3c9458f3b59747442"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_util-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

