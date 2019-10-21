
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Performant and robust open-source DDS implementation."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libcunit-dev"
ROS_BUILDTOOL_DEPENDS = "cmake-native java-native maven-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "java-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "EPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=b901de788bda0d0c6bc10db65e6c0043"


SRC_URI = "https://github.com/ros2-gbp/cyclonedds-release/archive/release/dashing/cyclonedds/0.1.0-1.zip;downloadfilename=cyclonedds_0.1.0-1.zip"
SRC_URI[md5sum] = "179504d6a0e04223e551ee061fbc4b05"
SRC_URI[sha256sum] = "29fd6f99a99fd4fd9c8518326c70f52d8ae52c48cb2bfd684c61fc67b775deb6"

S = "${WORKDIR}/cyclonedds-release-release-dashing-cyclonedds-0.1.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

