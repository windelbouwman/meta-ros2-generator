
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


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_gui_cpp/1.0.5-1.zip;downloadfilename=rqt-gui-cpp_1.0.5-1.zip"
SRC_URI[md5sum] = "f863ec9c9270f9d31d4a4b872fe2acf8"
SRC_URI[sha256sum] = "79be7f3927f3caca3f907647589b18710cfdd41a2df1dab9b599779178dee832"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_gui_cpp-1.0.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

