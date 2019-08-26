
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ROS client library in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces rcl rcl-interfaces rcl-yaml-param-parser rmw-implementation rosgraph-msgs rosidl-generator-cpp rosidl-typesupport-c rosidl-typesupport-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces rcl rcl-interfaces rcl-yaml-param-parser rmw rmw-implementation rosgraph-msgs rosidl-generator-cpp rosidl-typesupport-c rosidl-typesupport-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake rcl rcl-yaml-param-parser rmw-implementation"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest ament-lint-auto ament-lint-common rmw rmw-implementation-cmake test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/dashing/rclcpp/0.7.7-1.zip;downloadfilename=rclcpp_0.7.7-1.zip"
SRC_URI[md5sum] = "2f14afed58027d2f6236a02963bcff90"
SRC_URI[sha256sum] = "9659e5de712598c25bbd5a81e6a836dd1db5d0af01a48f60a5a6556c201a1e6f"

S = "${WORKDIR}/rclcpp-release-release-dashing-rclcpp-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

