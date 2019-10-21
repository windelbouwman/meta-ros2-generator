
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Common rviz API, used by rviz plugins and applications. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs pluginlib qtbase5-dev rclcpp resource-retriever rviz-assimp-vendor rviz-ogre-vendor rviz-rendering sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tinyxml-vendor urdf yaml-cpp-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs pluginlib qtbase5-dev rclcpp resource-retriever rviz-assimp-vendor rviz-ogre-vendor rviz-rendering sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tinyxml-vendor urdf yaml-cpp-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs libqt5-core libqt5-gui libqt5-opengl libqt5-widgets pluginlib rclcpp resource-retriever rviz-ogre-vendor rviz-rendering sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros tinyxml-vendor urdf yaml-cpp-vendor"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-gmock ament-cmake-gtest ament-cmake-lint-cmake ament-cmake-uncrustify"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_common/6.1.4-1.zip;downloadfilename=rviz-common_6.1.4-1.zip"
SRC_URI[md5sum] = "b7c059d66d5d9ce3b1cc45dd7efa955d"
SRC_URI[sha256sum] = "2b8cfb2d7ab6a53116f6e2d90ec6c1d2f90037e39d12008bb538a2da2b943713"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_common-6.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

