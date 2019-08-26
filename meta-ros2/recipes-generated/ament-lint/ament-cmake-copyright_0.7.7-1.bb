
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cmake_copyright/0.7.7-1.zip;downloadfilename=ament-cmake-copyright_0.7.7-1.zip"
SRC_URI[md5sum] = "b5f3a7b9607d574e3c0a4f51bd71bc06"
SRC_URI[sha256sum] = "2da491e141df6a1175dc1613d92833eaff9d9c5fb34162a8b21c37a337162920"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cmake_copyright-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

