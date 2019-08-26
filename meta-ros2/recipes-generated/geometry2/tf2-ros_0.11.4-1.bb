
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package contains the ROS bindings for the tf2 library, for both Python and C++. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs message-filters rclcpp std-msgs tf2 tf2-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs message-filters rclcpp std-msgs tf2 tf2-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_ros/0.11.4-1.zip;downloadfilename=tf2-ros_0.11.4-1.zip"
SRC_URI[md5sum] = "a40b027421f70facc2258c056a3ed445"
SRC_URI[sha256sum] = "20e71fc916905b326bdf0b1c64152bc998a0356a40a9ac5a7e92d54380f6967b"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_ros-0.11.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

