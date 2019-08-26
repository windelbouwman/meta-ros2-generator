
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ROS specific CMake bits in the ament buildsystem."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake_ros-release/archive/release/dashing/ament_cmake_ros/0.7.0-1.zip;downloadfilename=ament-cmake-ros_0.7.0-1.zip"
SRC_URI[md5sum] = "56d00899c23130de59cd3f885c4a545e"
SRC_URI[sha256sum] = "8d3ce9991e58b002939a7c5246294f93aaac325ac469eb891aa295e351d85f07"

S = "${WORKDIR}/ament_cmake_ros-release-release-dashing-ament_cmake_ros-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

