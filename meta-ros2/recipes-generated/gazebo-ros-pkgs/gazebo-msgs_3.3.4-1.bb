
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_msgs/3.3.4-1.zip;downloadfilename=gazebo-msgs_3.3.4-1.zip"
SRC_URI[md5sum] = "03b6a25d1c0f17905751b86f5fad80a0"
SRC_URI[sha256sum] = "7f145328621dfe5fad829de5fb97fc81eae9e8ff5dbb379a4f20234b2f30beaf"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_msgs-3.3.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

