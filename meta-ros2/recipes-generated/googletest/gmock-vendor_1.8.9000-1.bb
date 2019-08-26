
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The package provides GoogleMock."
SECTION = "devel"

ROS_BUILD_DEPENDS = "cmake"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "gtest-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/dashing/gmock_vendor/1.8.9000-1.zip;downloadfilename=gmock-vendor_1.8.9000-1.zip"
SRC_URI[md5sum] = "77f6b70ab44b397daffdf2188850378d"
SRC_URI[sha256sum] = "d2dcd6f7e3c75b44b3db49d5a2951b8d23f12bd3795e15194e18157b0bff2d30"

S = "${WORKDIR}/googletest-release-release-dashing-gmock_vendor-1.8.9000-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

