
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around libcurl, it provides a fixed CMake module and an ExternalProject build of it. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "curl"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "curl"
ROS_BUILDTOOL_EXPORT_DEPENDS = "pkg-config-native"
ROS_EXEC_DEPENDS = "curl"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/dashing/libcurl_vendor/2.1.0-2.zip;downloadfilename=libcurl-vendor_2.1.0-2.zip"
SRC_URI[md5sum] = "5c01363c8a6d35bc4108599be151fed3"
SRC_URI[sha256sum] = "f124bcfc7091d27105a5df2c78540beec9e08877d36c0a304adcaec32b10c829"

S = "${WORKDIR}/resource_retriever-release-release-dashing-libcurl_vendor-2.1.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

