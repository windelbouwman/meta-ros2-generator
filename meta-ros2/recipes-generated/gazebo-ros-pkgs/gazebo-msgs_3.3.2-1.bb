
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Message and service data structures for interacting with Gazebo from ROS2. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs std-msgs trajectory-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-runtime std-msgs trajectory-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_msgs/3.3.2-1.zip;downloadfilename=gazebo-msgs_3.3.2-1.zip"
SRC_URI[md5sum] = "0d6bd00346ea958182bb11fad93f6cc6"
SRC_URI[sha256sum] = "d2e53ddcfb19fa0980d0429531d028f7faaea955308be939f7be4aa214c62d12"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_msgs-3.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

