
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Common messages for interacting with Amazon Lex using the lex_node package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/dashing/lex_common_msgs/3.0.0-1.zip;downloadfilename=lex-common-msgs_3.0.0-1.zip"
SRC_URI[md5sum] = "b5eac3b91ce624dd2b594488b98c1712"
SRC_URI[sha256sum] = "b5a2314cd0e00497bd25d3d64e31eb0a8267c5b5e2ab03d9c000d2e25676c6cd"

S = "${WORKDIR}/lex_node-release-release-dashing-lex_common_msgs-3.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

