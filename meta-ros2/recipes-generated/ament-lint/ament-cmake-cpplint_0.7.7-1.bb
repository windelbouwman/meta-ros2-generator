
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The CMake API for ament_cpplint to lint C / C++ code using cpplint. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-test-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native ament-cpplint-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-copyright ament-cmake-lint-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cmake_cpplint/0.7.7-1.zip;downloadfilename=ament-cmake-cpplint_0.7.7-1.zip"
SRC_URI[md5sum] = "9fd82982e526b75d9172ae8ee738f4ad"
SRC_URI[sha256sum] = "c9d3cecc7c92e49e5205d087488faaf58a3df01cf3d09739629237f021360f93"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cmake_cpplint-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

