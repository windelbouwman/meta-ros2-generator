
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Contains a set of tools that can be used from a hard realtime thread, without breaking the realtime behavior."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp rclcpp-action"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp rclcpp-action"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = "rclcpp rclcpp-action"
ROS_TEST_DEPENDS = "ament-cmake-gmock rclcpp-action test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/dashing/realtime_tools/2.0.0-1.zip;downloadfilename=realtime-tools_2.0.0-1.zip"
SRC_URI[md5sum] = "7798aeb1ce484358dc7904b654bbf476"
SRC_URI[sha256sum] = "460f28a7f06d557e5282e299a971e845892070f1da341b8c70d7aeddbc5393de"

S = "${WORKDIR}/realtime_tools-release-release-dashing-realtime_tools-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

