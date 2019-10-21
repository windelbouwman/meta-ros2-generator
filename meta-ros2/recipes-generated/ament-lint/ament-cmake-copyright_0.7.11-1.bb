
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The CMake API for ament_copyright to check every source file contains copyright reference."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-test-native ament-copyright-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native ament-copyright-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-lint-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cmake_copyright/0.7.11-1.zip;downloadfilename=ament-cmake-copyright_0.7.11-1.zip"
SRC_URI[md5sum] = "53f4af029fa98c5a098afd9c9ff6b1bc"
SRC_URI[sha256sum] = "68fa7ba84e9b780f6c56886adb5dd153dcbcd67a51e05d275e4e0c678ee2d49d"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cmake_copyright-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

