
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  marti_can_msgs  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_can_msgs/1.0.0-1.zip;downloadfilename=marti-can-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "9ed5723e4b02704e12715c7e95b290c1"
SRC_URI[sha256sum] = "a31d9d73ddca36b6c612d0f68cbd92947e57d1f1bae5129e935f1d69345fe531"

S = "${WORKDIR}/marti_messages-release-release-dashing-marti_can_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

