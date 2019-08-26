
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing various utility types and functions for C"
SECTION = "devel"

ROS_BUILD_DEPENDS = "libyaml-vendor rcl rcutils yaml"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "libyaml-vendor yaml"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libyaml-vendor yaml"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl_yaml_param_parser/0.7.6-1.zip;downloadfilename=rcl-yaml-param-parser_0.7.6-1.zip"
SRC_URI[md5sum] = "d2e94392b234d9e1f86d982bb89113be"
SRC_URI[sha256sum] = "4bf9786499c46b5bd14823c4640593fd107255dd5d6273482044a0b0eacc6557"

S = "${WORKDIR}/rcl-release-release-dashing-rcl_yaml_param_parser-0.7.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

