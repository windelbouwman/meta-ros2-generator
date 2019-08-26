
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Wrapper (aka vendor package) around the FMILibrary by Modelon AB (JModelica.org)"
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


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=462fb5ac4d6b3c5fc01984a3a0174ac0"


SRC_URI = "https://github.com/boschresearch/fmilibrary_vendor-release/archive/release/dashing/fmilibrary_vendor/0.1.0-1.zip;downloadfilename=fmilibrary-vendor_0.1.0-1.zip"
SRC_URI[md5sum] = "04e2c2892e754457cb3edce128c0985d"
SRC_URI[sha256sum] = "8291df89e5f753d7a82d5f2b6c0d62c18f9e7a2be1c92660b96a8f1ccb3bcff8"

S = "${WORKDIR}/fmilibrary_vendor-release-release-dashing-fmilibrary_vendor-0.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

