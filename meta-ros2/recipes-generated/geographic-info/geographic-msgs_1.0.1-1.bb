
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS messages for Geographic Information Systems. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs rosidl-default-generators std-msgs unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs std-msgs unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rosidl-default-runtime std-msgs unique-identifier-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/dashing/geographic_msgs/1.0.1-1.zip;downloadfilename=geographic-msgs_1.0.1-1.zip"
SRC_URI[md5sum] = "47f0966e970da31e6f7fcd07f4aa0a5e"
SRC_URI[sha256sum] = "75a25837b5049cba801da6357bf283c1bea5e917d97933e2344a7e934e312689"

S = "${WORKDIR}/geographic_info-release-release-dashing-geographic_msgs-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

