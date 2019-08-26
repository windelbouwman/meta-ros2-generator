
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS messages for universally unique identifiers. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/unique_identifier_msgs-release/archive/release/dashing/unique_identifier_msgs/2.1.0-1.zip;downloadfilename=unique-identifier-msgs_2.1.0-1.zip"
SRC_URI[md5sum] = "a93c66be9727e5ca757423c92331e7e9"
SRC_URI[sha256sum] = "a2764056c332b7507f95d7c754b43bb5db97c59f36f4adf49243be052c14cd2a"

S = "${WORKDIR}/unique_identifier_msgs-release-release-dashing-unique_identifier_msgs-2.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

