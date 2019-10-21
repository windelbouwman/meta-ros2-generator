
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Adds action APIs for C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs ament-cmake rcl-action rclcpp rosidl-generator-c rosidl-generator-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs ament-cmake rcl-action rclcpp rosidl-generator-c rosidl-generator-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs ament-cmake rcl-action rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/dashing/rclcpp_action/0.7.11-1.zip;downloadfilename=rclcpp-action_0.7.11-1.zip"
SRC_URI[md5sum] = "22f17b08abea1b167d4bd5656175d9b3"
SRC_URI[sha256sum] = "5e2c6982af29a9b8ad3783f484cf0992c86c029471dfaa7b00674cb688608ed0"

S = "${WORKDIR}/rclcpp-release-release-dashing-rclcpp_action-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

