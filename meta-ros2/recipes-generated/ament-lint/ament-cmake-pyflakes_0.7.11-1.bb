
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The CMake API for ament_pyflakes to check code using pyflakes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-test-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native ament-pyflakes-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-copyright ament-cmake-lint-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cmake_pyflakes/0.7.11-1.zip;downloadfilename=ament-cmake-pyflakes_0.7.11-1.zip"
SRC_URI[md5sum] = "b587b72cbaea5da49e9a50932f4c8d0d"
SRC_URI[sha256sum] = "219323d83fce92e188dfcdfe2b5ebf929796e41f222db555b08e961734c38d0c"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cmake_pyflakes-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

