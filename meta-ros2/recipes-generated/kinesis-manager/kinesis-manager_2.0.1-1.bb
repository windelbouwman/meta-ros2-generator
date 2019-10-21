
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "AWS Kinesis stream management library intended for use with the Kinesis Video Producer SDK"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common boost curl libssl-dev log4cplus"
ROS_BUILDTOOL_DEPENDS = "catkin-native cmake-native pkg-config-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common boost curl libssl-dev log4cplus"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common boost curl libssl-dev log4cplus"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/kinesis_manager-release/archive/release/dashing/kinesis_manager/2.0.1-1.zip;downloadfilename=kinesis-manager_2.0.1-1.zip"
SRC_URI[md5sum] = "c18a98c9695ab13ca9c4c9254d0d40b9"
SRC_URI[sha256sum] = "3f11084424c12486489ba61ff69c950ccaa9d6c591ca85fdb31b7594ae7fe2e7"

S = "${WORKDIR}/kinesis_manager-release-release-dashing-kinesis_manager-2.0.1-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

