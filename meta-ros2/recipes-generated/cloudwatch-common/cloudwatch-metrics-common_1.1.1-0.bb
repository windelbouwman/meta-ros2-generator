
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Library used by ROS1/2 node to publish metrics"
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


SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/dashing/cloudwatch_metrics_common/1.1.1-0.zip;downloadfilename=cloudwatch-metrics-common_1.1.1-0.zip"
SRC_URI[md5sum] = "7d35f2dcb57669e7823a91edeb707f2c"
SRC_URI[sha256sum] = "0d92e7bdd42666d392dd2209b53605b7e7baac17f853299e5d95d460657f8d64"

S = "${WORKDIR}/cloudwatch_common-release-release-dashing-cloudwatch_metrics_common-1.1.1-0"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

