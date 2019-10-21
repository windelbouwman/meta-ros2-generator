
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing a prototype for lifecycle implementation"
SECTION = "devel"

ROS_BUILD_DEPENDS = "lifecycle-msgs rcl-lifecycle rclcpp rmw-implementation rosidl-typesupport-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "lifecycle-msgs rcl-lifecycle rclcpp rmw-implementation rosidl-typesupport-cpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/dashing/rclcpp_lifecycle/0.7.11-1.zip;downloadfilename=rclcpp-lifecycle_0.7.11-1.zip"
SRC_URI[md5sum] = "42dc52aa76495ffcdde63d60bc0249d6"
SRC_URI[sha256sum] = "b682e3e3cc57ee8258fc8dd3d5e14cade26a498fe6e7c6303231de6074fac27b"

S = "${WORKDIR}/rclcpp-release-release-dashing-rclcpp_lifecycle-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

