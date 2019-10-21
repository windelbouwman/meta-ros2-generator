
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/pendulum_control/0.7.9-1.zip;downloadfilename=pendulum-control_0.7.9-1.zip"
SRC_URI[md5sum] = "d790a8e49ae5ef2bbef072bb473567e2"
SRC_URI[sha256sum] = "7d69ece45ac864fb3eb39e7448c1743b6436e5d4e6c93963e932a2ba020109a6"

S = "${WORKDIR}/demos-release-release-dashing-pendulum_control-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

