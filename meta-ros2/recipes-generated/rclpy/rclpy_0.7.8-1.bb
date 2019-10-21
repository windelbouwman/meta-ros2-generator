
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing the Python client."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcl rcl-action rcl-yaml-param-parser rcutils rmw-implementation rmw-implementation-cmake unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native python-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "rcl rcl-action rcl-yaml-param-parser rmw-implementation unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python builtin-interfaces rcl rcl-action rcl-yaml-param-parser rmw-implementation rosgraph-msgs unique-identifier-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common python3-pytest rcl-interfaces rosidl-generator-py test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rclpy-release/archive/release/dashing/rclpy/0.7.8-1.zip;downloadfilename=rclpy_0.7.8-1.zip"
SRC_URI[md5sum] = "107541472de80a31a5a3df395c6f1a53"
SRC_URI[sha256sum] = "c4554c4451c4578f7073a58003471bcdb42bac10f5f5c5e43cd0c9d4e874735f"

S = "${WORKDIR}/rclpy-release-release-dashing-rclpy-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

