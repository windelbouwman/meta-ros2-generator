
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some standard message definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/std_msgs/0.7.0-1.zip;downloadfilename=std-msgs_0.7.0-1.zip"
SRC_URI[md5sum] = "f3aa24aa65e449ad47aa32c10ee34844"
SRC_URI[sha256sum] = "63939b8838fe8feaba8797a9ef4a6ed2a2797c3d455924e3571fe260b826b076"

S = "${WORKDIR}/common_interfaces-release-release-dashing-std_msgs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

