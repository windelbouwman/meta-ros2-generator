
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some message definitions which describe geometric shapes."
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/shape_msgs/0.7.0-1.zip;downloadfilename=shape-msgs_0.7.0-1.zip"
SRC_URI[md5sum] = "709a105e881ca1e5b2715c584d112dec"
SRC_URI[sha256sum] = "c392d7c345d1b4db094ffa28db587688c4ac69ab28bdb764e7fa7880dbded0e9"

S = "${WORKDIR}/common_interfaces-release-release-dashing-shape_msgs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

