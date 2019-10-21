
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS messages for the cartographer_ros package. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"


SRC_URI = "https://github.com/ros2-gbp/cartographer_ros-release/archive/release/dashing/cartographer_ros_msgs/1.0.9000-1.zip;downloadfilename=cartographer-ros-msgs_1.0.9000-1.zip"
SRC_URI[md5sum] = "18332899885ddf6609743311ebe2f9c3"
SRC_URI[sha256sum] = "5a500f460db2409431b7c9e4d8201f9943ec6752377b519357941957ec001e7d"

S = "${WORKDIR}/cartographer_ros-release-release-dashing-cartographer_ros_msgs-1.0.9000-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

