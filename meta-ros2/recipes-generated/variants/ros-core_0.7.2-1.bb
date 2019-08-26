
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package to aggregate the packages required to use publish / subscribe, services, generate messages and other core ROS concepts."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake ament-cmake-auto ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest ament-cmake-ros ament-index-cpp ament-index-python ament-lint-auto ament-lint-common class-loader common-interfaces pluginlib rcl-lifecycle rclcpp rclcpp-lifecycle rclpy ros-environment ros2action ros2component ros2launch ros2lifecycle ros2msg ros2multicast ros2node ros2param ros2pkg ros2run ros2service ros2srv ros2topic rosidl-default-generators rosidl-default-runtime sros2 sros2-cmake"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/dashing/ros_core/0.7.2-1.zip;downloadfilename=ros-core_0.7.2-1.zip"
SRC_URI[md5sum] = "af38aeeb211bd03824995361991d0aa2"
SRC_URI[sha256sum] = "3ba40dc423b532614a07153a26a09a4d38fcf67fdc2a0411607a8dfd8c92dba7"

S = "${WORKDIR}/variants-release-release-dashing-ros_core-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

