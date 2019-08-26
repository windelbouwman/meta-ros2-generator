
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " A set of ROS2 message filters which take in messages and may output those messages at a later time, based on the conditions that filter needs met. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces rclcpp rclpy"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-python-native ament-cmake-ros-native python-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto sensor-msgs std-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/ros2_message_filters-release/archive/release/dashing/message_filters/3.1.2-1.zip;downloadfilename=message-filters_3.1.2-1.zip"
SRC_URI[md5sum] = "1d7b2fcd17b130898585a5edd195b3f5"
SRC_URI[sha256sum] = "58531ece0777204a456c34d745279a18c9a29be4e7a365f29ce42d9e5d10b9aa"

S = "${WORKDIR}/message_filters-release-release-dashing-message_filters-3.1.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

