
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "CMake shim over the poco library."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libpoco-dev pcre zlib"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libpoco-dev pcre zlib"
ROS_BUILDTOOL_EXPORT_DEPENDS = "cmake-native"
ROS_EXEC_DEPENDS = "libpoco-dev pcre zlib"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=401a7342a877608092ef332b6948eb03"


SRC_URI = "https://github.com/ros2-gbp/poco_vendor-release/archive/release/dashing/poco_vendor/1.2.0-1.zip;downloadfilename=poco-vendor_1.2.0-1.zip"
SRC_URI[md5sum] = "9bc298dbeb9f47d9a09090a33a6915ac"
SRC_URI[sha256sum] = "0afbf1118a6bc8d4e2674a0271e5b9804ecdbd4b058a9e01c9d7b48323638bbc"

S = "${WORKDIR}/poco_vendor-release-release-dashing-poco_vendor-1.2.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

