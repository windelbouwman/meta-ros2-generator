
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " turtlesim is a tool made for teaching ROS and ROS packages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp geometry-msgs qt5-qmake qtbase5-dev rclcpp rclcpp-action std-msgs std-srvs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp geometry-msgs rclcpp rclcpp-action std-msgs std-srvs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp geometry-msgs libqt5-core libqt5-gui rclcpp rclcpp-action rosidl-default-runtime std-msgs std-srvs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/ros_tutorials-release/archive/release/dashing/turtlesim/1.0.1-1.zip;downloadfilename=turtlesim_1.0.1-1.zip"
SRC_URI[md5sum] = "19675dc0585bba96f09cd8ea44848f16"
SRC_URI[sha256sum] = "a91e0a9fe93d430db2f3efd8c9712920b8db29cae7cfbbec9c0b45ca42a61524"

S = "${WORKDIR}/turtlesim-release-release-dashing-turtlesim-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

