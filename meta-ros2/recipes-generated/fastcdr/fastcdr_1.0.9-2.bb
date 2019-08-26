
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "CDR serialization implementation."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/fastcdr-release/archive/release/dashing/fastcdr/1.0.9-2.zip;downloadfilename=fastcdr_1.0.9-2.zip"
SRC_URI[md5sum] = "d277983e35d88491bea0fab231a33a18"
SRC_URI[sha256sum] = "573e614c1aa74978f5d8bbf10fa0f57800c1b63d7fdf877a7b8c4f64b9476b48"

S = "${WORKDIR}/fastcdr-release-release-dashing-fastcdr-1.0.9-2"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

