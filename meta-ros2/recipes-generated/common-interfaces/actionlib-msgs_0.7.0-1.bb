
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some message definitions used in the implementation or actions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/actionlib_msgs/0.7.0-1.zip;downloadfilename=actionlib-msgs_0.7.0-1.zip"
SRC_URI[md5sum] = "936591fecaf45453f950086037420dfd"
SRC_URI[sha256sum] = "02a0ff7c0b1d2b191acdbacfb0dd5bd9e31a56f20720b4998fa1e44a98c0bbd8"

S = "${WORKDIR}/common_interfaces-release-release-dashing-actionlib_msgs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

