
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to export definitions to downstream packages in the ament buildsystem."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_export_definitions/0.7.3-1.zip;downloadfilename=ament-cmake-export-definitions_0.7.3-1.zip"
SRC_URI[md5sum] = "82021231176d46cdf8cdebe742bf7b04"
SRC_URI[sha256sum] = "03a76514b72576d228c879acd07d65aed569396108c76e2145293b3cee12e7e0"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_export_definitions-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

