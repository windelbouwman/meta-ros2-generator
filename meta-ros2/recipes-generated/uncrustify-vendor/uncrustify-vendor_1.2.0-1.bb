
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around uncrustify, providing nothing but a dependency on uncrustify, on some systems. On others, it provides an ExternalProject build of uncrustify. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "uncrustify"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "uncrustify"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "uncrustify"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/uncrustify_vendor-release/archive/release/dashing/uncrustify_vendor/1.2.0-1.zip;downloadfilename=uncrustify-vendor_1.2.0-1.zip"
SRC_URI[md5sum] = "8778537c98162c9bb9a2640f39259d94"
SRC_URI[sha256sum] = "8f38a6ff7eb4e09d1f18ff66ba32acb313f3b3c4c8e26aa70a1dc520d696e465"

S = "${WORKDIR}/uncrustify_vendor-release-release-dashing-uncrustify_vendor-1.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

