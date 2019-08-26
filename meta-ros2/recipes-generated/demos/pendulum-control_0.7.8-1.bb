
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Demonstrates ROS 2's realtime capabilities with a simulated inverted pendulum."
SECTION = "devel"

ROS_BUILD_DEPENDS = "pendulum-msgs rclcpp rttest tlsf-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pendulum-msgs rclcpp rttest tlsf-cpp"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake launch-testing-ros rmw-implementation-cmake ros2run"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/pendulum_control/0.7.8-1.zip;downloadfilename=pendulum-control_0.7.8-1.zip"
SRC_URI[md5sum] = "0f8bd83b27e63f65bbaa5007eee4843e"
SRC_URI[sha256sum] = "4de174a43ff3f899edd3d3c087049502808e96ef2ab6aeb15cc6d2513ad02c47"

S = "${WORKDIR}/demos-release-release-dashing-pendulum_control-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

