
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Lex Common utilities, intended for use by Lex clients"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake aws-common catkin ros-environment"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest google-mock gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=80318c4afef111a7690eaf237460856b"


SRC_URI = "https://github.com/aws-gbp/lex_common-release/archive/release/dashing/lex_common/1.0.0-1.zip;downloadfilename=lex-common_1.0.0-1.zip"
SRC_URI[md5sum] = "ad1b6ff3fc197c0228b7e95dd66e7788"
SRC_URI[sha256sum] = "b3eab175b709dc7e1dc59094ca834fa4497bbf67ebd8ff9d46c5e90c4127604a"

S = "${WORKDIR}/lex_common-release-release-dashing-lex_common-1.0.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

