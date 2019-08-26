
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to add Google mock-based tests in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-gtest-native ament-cmake-test-native gmock-vendor-native google-mock-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_gmock/0.7.3-1.zip;downloadfilename=ament-cmake-gmock_0.7.3-1.zip"
SRC_URI[md5sum] = "c5c136d3d8eeefc7604e469dc8f5f9c2"
SRC_URI[sha256sum] = "d24094ced3a78a7970783f0697a756db2bf0c5e1830ead543c033aac2c195e77"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_gmock-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

