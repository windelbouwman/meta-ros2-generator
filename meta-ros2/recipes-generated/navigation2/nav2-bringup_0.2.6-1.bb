
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Bringup scripts and configurations for the navigation2 stack"
SECTION = "devel"

ROS_BUILD_DEPENDS = "launch-ros nav2-common navigation2"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch-ros nav2-common navigation2"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_bringup/0.2.6-1.zip;downloadfilename=nav2-bringup_0.2.6-1.zip"
SRC_URI[md5sum] = "58cf7f05a2431a43c4d21e3eea8f9a29"
SRC_URI[sha256sum] = "4203a5f979816afd6dd226606114057c85b159bdfcd10a5c6196196cb9368470"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_bringup-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

