
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


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz2/6.1.4-1.zip;downloadfilename=rviz2_6.1.4-1.zip"
SRC_URI[md5sum] = "e65dbbedeaf07931f8be7943265bafc4"
SRC_URI[sha256sum] = "fcb3fc3dfe180a72530f8f9e1cc06e2b418404ac249a772c51aa7afe58bf6a54"

S = "${WORKDIR}/rviz-release-release-dashing-rviz2-6.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

