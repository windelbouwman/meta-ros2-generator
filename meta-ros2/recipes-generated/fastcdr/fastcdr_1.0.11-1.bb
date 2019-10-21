
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


SRC_URI = "https://github.com/ros2-gbp/fastcdr-release/archive/release/dashing/fastcdr/1.0.11-1.zip;downloadfilename=fastcdr_1.0.11-1.zip"
SRC_URI[md5sum] = "ade8ecb5a6e397b1f858a3c2b2945a03"
SRC_URI[sha256sum] = "73f4b587ee0dedf50fe7ec39ed5474ea4112c9192351d994c3918fcf89001007"

S = "${WORKDIR}/fastcdr-release-release-dashing-fastcdr-1.0.11-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

