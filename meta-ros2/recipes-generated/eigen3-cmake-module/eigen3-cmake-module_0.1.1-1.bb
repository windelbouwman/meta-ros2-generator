
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Exports a custom CMake module to find Eigen3."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-copyright ament-cmake-lint-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/eigen3_cmake_module-release/archive/release/dashing/eigen3_cmake_module/0.1.1-1.zip;downloadfilename=eigen3-cmake-module_0.1.1-1.zip"
SRC_URI[md5sum] = "491023743121a144ee4f28edc8871f4c"
SRC_URI[sha256sum] = "e80226b1f7be44c6355787ba7bb5e4afdeb2f3784ff9913ed1caaf1420d45b0d"

S = "${WORKDIR}/eigen3_cmake_module-release-release-dashing-eigen3_cmake_module-0.1.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

