
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "CMake shim over the tinxml library."
SECTION = "devel"

ROS_BUILD_DEPENDS = "tinyxml"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "tinyxml"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "tinyxml"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/tinyxml_vendor-release/archive/release/dashing/tinyxml_vendor/0.7.0-1.zip;downloadfilename=tinyxml-vendor_0.7.0-1.zip"
SRC_URI[md5sum] = "9ff41107d93302fadf3c901bc5bf611f"
SRC_URI[sha256sum] = "8a59a1e2d4b7b1e51592e2acf36862386f7253bd7912277fc86ce8c260dfa0ff"

S = "${WORKDIR}/tinyxml_vendor-release-release-dashing-tinyxml_vendor-0.7.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

