
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The CMake API for ament_pep257 to check code against the style conventions in PEP 257. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-test-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native ament-pep257-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-copyright ament-cmake-lint-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cmake_pep257/0.7.7-1.zip;downloadfilename=ament-cmake-pep257_0.7.7-1.zip"
SRC_URI[md5sum] = "d95c47a7ab64e69be263c57242c148e5"
SRC_URI[sha256sum] = "d5a3174b6714bd5733f2c1eec4a4ef0af9548f9f9c2100d229cd10ebc341e508"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cmake_pep257-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

