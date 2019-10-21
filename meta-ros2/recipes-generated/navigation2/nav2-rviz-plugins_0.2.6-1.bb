
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Navigation 2 plugins for rviz"
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs nav-msgs nav2-lifecycle-manager nav2-msgs nav2-util pluginlib qtbase5-dev rclcpp rclcpp-lifecycle resource-retriever rviz-common rviz-default-plugins rviz-ogre-vendor rviz-rendering std-msgs tf2-geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs nav-msgs nav2-lifecycle-manager nav2-msgs nav2-util pluginlib rclcpp rclcpp-lifecycle resource-retriever rviz-common rviz-default-plugins rviz-ogre-vendor rviz-rendering std-msgs tf2-geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs libqt5-core libqt5-gui libqt5-opengl libqt5-widgets nav-msgs nav2-lifecycle-manager nav2-msgs nav2-util pluginlib rclcpp rclcpp-lifecycle resource-retriever rviz-common rviz-default-plugins rviz-ogre-vendor rviz-rendering std-msgs tf2-geometry-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_rviz_plugins/0.2.6-1.zip;downloadfilename=nav2-rviz-plugins_0.2.6-1.zip"
SRC_URI[md5sum] = "4e00e12fb2d7168cddbe967cfd24c592"
SRC_URI[sha256sum] = "afcdf3385d3b5b8795e21a22f9b5b223031e3566a6f6938b7e0e94ddb7bad0e1"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_rviz_plugins-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

