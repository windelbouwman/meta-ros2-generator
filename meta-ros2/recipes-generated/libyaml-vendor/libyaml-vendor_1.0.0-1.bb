
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around libyaml, provides the last version (1.8.0 rc) that ships with a CMake module "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/libyaml_vendor-release/archive/release/dashing/libyaml_vendor/1.0.0-1.zip;downloadfilename=libyaml-vendor_1.0.0-1.zip"
SRC_URI[md5sum] = "a876f7e96fb29388f94656cab41750e0"
SRC_URI[sha256sum] = "e041dc8f7db9b7e7ef5da58f98855fae6b4c13797c9028f5a45acb5a235907f0"

S = "${WORKDIR}/libyaml_vendor-release-release-dashing-libyaml_vendor-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

