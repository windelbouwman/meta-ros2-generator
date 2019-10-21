
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


SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl_yaml_param_parser/0.7.7-1.zip;downloadfilename=rcl-yaml-param-parser_0.7.7-1.zip"
SRC_URI[md5sum] = "b6a65ee5a7874c5134a195fd379378c9"
SRC_URI[sha256sum] = "f4c676cf10259db202073b2f4d78d39ef4bbf1ed600ec53242c7facd8dfdd604"

S = "${WORKDIR}/rcl-release-release-dashing-rcl_yaml_param_parser-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

