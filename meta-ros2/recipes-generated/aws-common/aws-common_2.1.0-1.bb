
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Common AWS SDK utilities, intended for use by ROS packages using the AWS SDK"
SECTION = "devel"

ROS_BUILD_DEPENDS = "curl libssl-dev ros-environment uuid zlib"
ROS_BUILDTOOL_DEPENDS = "catkin-native cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "curl libssl-dev uuid zlib"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "curl libssl-dev uuid zlib"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/aws_common-release/archive/release/dashing/aws_common/2.1.0-1.zip;downloadfilename=aws-common_2.1.0-1.zip"
SRC_URI[md5sum] = "92da24093f834f110227e7573138b45b"
SRC_URI[sha256sum] = "dd003e94481ffc53d57f4fe2226b7f302dc027da1416ba0d31384495a9b34fa9"

S = "${WORKDIR}/aws_common-release-release-dashing-aws_common-2.1.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

