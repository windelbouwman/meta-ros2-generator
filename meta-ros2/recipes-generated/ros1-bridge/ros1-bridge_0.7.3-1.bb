
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A simple bridge between ROS 1 and ROS 2"
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs actionlib-msgs builtin-interfaces diagnostic-msgs example-interfaces gazebo-msgs geometry-msgs nav-msgs pkg-config python3-yaml rclcpp rcutils rmw-implementation-cmake sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native ament-index-python-native python3-catkin-pkg-modules-native rosidl-cmake-native rosidl-parser-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "pkg-config-native"
ROS_EXEC_DEPENDS = "action-msgs actionlib-msgs builtin-interfaces diagnostic-msgs example-interfaces gazebo-msgs geometry-msgs nav-msgs python3-yaml rclcpp rcutils sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs tf2-msgs trajectory-msgs visualization-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common demo-nodes-cpp diagnostic-msgs launch launch-testing launch-testing-ament-cmake launch-testing-ros ros2run"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros1_bridge-release/archive/release/dashing/ros1_bridge/0.7.3-1.zip;downloadfilename=ros1-bridge_0.7.3-1.zip"
SRC_URI[md5sum] = "96afe6f41882c75e697c8a6793d364d7"
SRC_URI[sha256sum] = "2e72a5cc3fb624e85aa06f4eca1602ecf528199095480d4f1cfc8fc9a2fe3391"

S = "${WORKDIR}/ros1_bridge-release-release-dashing-ros1_bridge-0.7.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

