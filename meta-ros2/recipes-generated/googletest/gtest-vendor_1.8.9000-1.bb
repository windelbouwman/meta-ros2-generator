
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The package provides GoogleTest."
SECTION = "devel"

ROS_BUILD_DEPENDS = "cmake"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=37;endline=37;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/dashing/gtest_vendor/1.8.9000-1.zip;downloadfilename=gtest-vendor_1.8.9000-1.zip"
SRC_URI[md5sum] = "f81e54002a832926f62b65ad5b151793"
SRC_URI[sha256sum] = "f235ccedfdb19955decaf07541016aa7a398cab5bf615386517f3df6aca18577"

S = "${WORKDIR}/googletest-release-release-dashing-gtest_vendor-1.8.9000-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

