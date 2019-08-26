
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_bringup/0.2.3-1.zip;downloadfilename=nav2-bringup_0.2.3-1.zip"
SRC_URI[md5sum] = "c8066afd44e3d0aeaa24edc911d23f6b"
SRC_URI[sha256sum] = "3f2642112c9614d89cbfabe7625f5eafb63788910b327a972fb1ee934fea5701"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_bringup-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

