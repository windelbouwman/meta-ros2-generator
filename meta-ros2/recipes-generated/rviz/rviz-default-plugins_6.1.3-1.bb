
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Several default plugins for rviz to cover the basic functionality. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs laser-geometry map-msgs nav-msgs pluginlib qtbase5-dev rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs laser-geometry map-msgs nav-msgs pluginlib rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs laser-geometry libqt5-core libqt5-gui libqt5-opengl libqt5-widgets map-msgs nav-msgs pluginlib rclcpp resource-retriever rviz-common rviz-rendering tinyxml-vendor urdf visualization-msgs"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-gmock ament-cmake-gtest ament-cmake-lint-cmake ament-cmake-uncrustify ament-index-cpp rviz-rendering-tests rviz-visual-testing-framework"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_default_plugins/6.1.3-1.zip;downloadfilename=rviz-default-plugins_6.1.3-1.zip"
SRC_URI[md5sum] = "6f8bce5a40483257f3ec6e17468dfb60"
SRC_URI[sha256sum] = "0d06320a10c48f36cd156ee9059d28db4ac72311082258fa081a8734052715ed"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_default_plugins-6.1.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

