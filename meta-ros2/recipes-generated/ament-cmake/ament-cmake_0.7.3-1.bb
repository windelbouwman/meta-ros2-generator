
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The entry point package for the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake-core ament-cmake-export-dependencies"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-cmake-core ament-cmake-export-definitions ament-cmake-export-dependencies ament-cmake-export-include-directories ament-cmake-export-interfaces ament-cmake-export-libraries ament-cmake-export-link-flags ament-cmake-libraries ament-cmake-python ament-cmake-target-dependencies ament-cmake-test"
ROS_BUILDTOOL_EXPORT_DEPENDS = "cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake/0.7.3-1.zip;downloadfilename=ament-cmake_0.7.3-1.zip"
SRC_URI[md5sum] = "a35a207354333951b68edb6c383a1733"
SRC_URI[sha256sum] = "d50a54c86d3b39d2abae6826bb8a26de95f9f5142fda5148d664c1cac3156f29"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

