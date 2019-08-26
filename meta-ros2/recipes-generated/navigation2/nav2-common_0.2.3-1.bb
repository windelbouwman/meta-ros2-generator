
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_common/0.2.3-1.zip;downloadfilename=nav2-common_0.2.3-1.zip"
SRC_URI[md5sum] = "c777b4b3d0513a3d5110882f1e365beb"
SRC_URI[sha256sum] = "9deb270f97a2bc25ca63a3a3dbb6cbf108de8a002d66cec505f737e5f95011f4"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_common-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

