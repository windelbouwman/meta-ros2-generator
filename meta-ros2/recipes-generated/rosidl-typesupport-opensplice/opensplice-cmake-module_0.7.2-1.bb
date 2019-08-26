
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provide CMake module to find PrismTech OpenSplice."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libopensplice69"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/dashing/opensplice_cmake_module/0.7.2-1.zip;downloadfilename=opensplice-cmake-module_0.7.2-1.zip"
SRC_URI[md5sum] = "71a8ac2b7de5aff5490d140487db5c24"
SRC_URI[sha256sum] = "126b9fb71b63c0965463b12eb22f642c20f3b32f3d1b92e0b8abed60373c61b0"

S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-dashing-opensplice_cmake_module-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

