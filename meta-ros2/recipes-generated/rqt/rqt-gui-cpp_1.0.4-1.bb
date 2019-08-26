
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_gui_cpp enables GUI plugins to use the C++ client library for ROS."
SECTION = "devel"

ROS_BUILD_DEPENDS = "qt-gui qt-gui-cpp qtbase5-dev rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "qt-gui qt-gui-cpp rclcpp"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_gui_cpp/1.0.4-1.zip;downloadfilename=rqt-gui-cpp_1.0.4-1.zip"
SRC_URI[md5sum] = "1de4bb996f32d9dbb7675e4be5de6857"
SRC_URI[sha256sum] = "3a183d1d65b53296be218c1b821f74d153fdcbec4700b0f00128730e1bfcb904"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_gui_cpp-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

