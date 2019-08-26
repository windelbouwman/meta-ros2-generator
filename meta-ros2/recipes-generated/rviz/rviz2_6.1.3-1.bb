
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " 3D visualization tool for ROS. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "qtbase5-dev rviz-common rviz-ogre-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rviz-common rviz-ogre-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rviz-common rviz-default-plugins rviz-ogre-vendor"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-lint-cmake ament-cmake-uncrustify geometry-msgs rclcpp sensor-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz2/6.1.3-1.zip;downloadfilename=rviz2_6.1.3-1.zip"
SRC_URI[md5sum] = "1e600667dc4f19aae64ea850c4e77095"
SRC_URI[sha256sum] = "225f309b3d8e033467c519f0b9057c692e6d0d38dbc61f5b64af301f69b3f394"

S = "${WORKDIR}/rviz-release-release-dashing-rviz2-6.1.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

