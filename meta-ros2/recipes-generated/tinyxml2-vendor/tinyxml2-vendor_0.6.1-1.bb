
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around tinyxml2, providing nothing but a dependency on tinyxml2, on some systems. On others, it provides a fixed CMake module or even an ExternalProject build of tinyxml2. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "tinyxml2"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "tinyxml2"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "tinyxml2"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/tinyxml2_vendor-release/archive/release/dashing/tinyxml2_vendor/0.6.1-1.zip;downloadfilename=tinyxml2-vendor_0.6.1-1.zip"
SRC_URI[md5sum] = "f566283fb49c28379e34cce6eb134f42"
SRC_URI[sha256sum] = "8d5bd0952bca9239d4f878f920103926b7751533fe1a8cedf2922421ce2dd107"

S = "${WORKDIR}/tinyxml2_vendor-release-release-dashing-tinyxml2_vendor-0.6.1-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

