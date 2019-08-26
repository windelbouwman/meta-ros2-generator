
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport."
SECTION = "devel"

ROS_BUILD_DEPENDS = "cv-bridge geometry-msgs image-transport qt-gui-cpp qtbase5-dev rclcpp rqt-gui rqt-gui-cpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cv-bridge geometry-msgs image-transport qt-gui-cpp rclcpp rqt-gui rqt-gui-cpp sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_image_view-release/archive/release/dashing/rqt_image_view/1.0.2-1.zip;downloadfilename=rqt-image-view_1.0.2-1.zip"
SRC_URI[md5sum] = "117f94838a79379f6bdce125ccbc8563"
SRC_URI[sha256sum] = "add0310d853f679f27b8b4f4b3e6af935ad98c7e28ff954e4b22a372fac37618"

S = "${WORKDIR}/rqt_image_view-release-release-dashing-rqt_image_view-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

