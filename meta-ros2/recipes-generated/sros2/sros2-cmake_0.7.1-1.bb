
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Cmake macros to configure security for nodes"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake-test"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ros2cli sros2"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=80318c4afef111a7690eaf237460856b"


SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/dashing/sros2_cmake/0.7.1-1.zip;downloadfilename=sros2-cmake_0.7.1-1.zip"
SRC_URI[md5sum] = "40925e58e5680ecf223d314bca50a7c5"
SRC_URI[sha256sum] = "eaeae3877d693c83f56fd3eefa7454c1d2b15be4eb8f8212f1e414d81dc77bd7"

S = "${WORKDIR}/sros2-release-release-dashing-sros2_cmake-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

