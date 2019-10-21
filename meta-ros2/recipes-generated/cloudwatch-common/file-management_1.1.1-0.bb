
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "AWS CloudWatch management library used to manage offline files."
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common dataflow-lite"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common dataflow-lite"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common dataflow-lite"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/dashing/file_management/1.1.1-0.zip;downloadfilename=file-management_1.1.1-0.zip"
SRC_URI[md5sum] = "8859961db16b410942e7e31fc66842da"
SRC_URI[sha256sum] = "6f007d1d80181f2f25b41605473d7c7f9968f8f8f8f3239f4e156d89bd92251e"

S = "${WORKDIR}/cloudwatch_common-release-release-dashing-file_management-1.1.1-0"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

