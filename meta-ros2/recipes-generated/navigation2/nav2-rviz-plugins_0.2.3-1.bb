
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_rviz_plugins/0.2.3-1.zip;downloadfilename=nav2-rviz-plugins_0.2.3-1.zip"
SRC_URI[md5sum] = "285a99f617f1230212ef9846d7349946"
SRC_URI[sha256sum] = "6ef10b3bc87b1d2473958e5aa5d8ea1616aaaae6001e64047d7ccd7a8b672157"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_rviz_plugins-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

