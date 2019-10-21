
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "AWS CloudWatch management library used by ROS1/2 node to publish logs to CloudWatch service"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common dataflow-lite file-management"
ROS_BUILDTOOL_DEPENDS = "catkin-native cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common dataflow-lite file-management"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common dataflow-lite file-management"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/dashing/cloudwatch_logs_common/1.1.1-0.zip;downloadfilename=cloudwatch-logs-common_1.1.1-0.zip"
SRC_URI[md5sum] = "807a31b36e32b77753fae0d8367f4fab"
SRC_URI[sha256sum] = "54609204b2e805f6ee70b2a6ab70535555b5d3e2c478a67279d9cf3777475a4b"

S = "${WORKDIR}/cloudwatch_common-release-release-dashing-cloudwatch_logs_common-1.1.1-0"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

