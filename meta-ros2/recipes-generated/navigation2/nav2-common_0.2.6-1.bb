
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Common support functionality used throughout the navigation 2 stack"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake-python"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_common/0.2.6-1.zip;downloadfilename=nav2-common_0.2.6-1.zip"
SRC_URI[md5sum] = "63f1a77d3297f520ef1be75535a35812"
SRC_URI[sha256sum] = "d82c5167b50f9ddbcaf22aff434195c0e1b1076b0212e84a33304719531d1f45"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_common-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

