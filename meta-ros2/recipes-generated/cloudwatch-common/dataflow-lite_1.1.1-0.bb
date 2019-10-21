
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Light version of dataflow libraries"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/dashing/dataflow_lite/1.1.1-0.zip;downloadfilename=dataflow-lite_1.1.1-0.zip"
SRC_URI[md5sum] = "87aa6376a00f8bc79d96f92a1e85cada"
SRC_URI[sha256sum] = "f111d6765d2385a7ce544fffea76b5436bc01b0097cc51038fc7039db873ddbb"

S = "${WORKDIR}/cloudwatch_common-release-release-dashing-dataflow_lite-1.1.1-0"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

