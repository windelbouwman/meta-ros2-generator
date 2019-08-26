
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to add gtest-based tests in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native gtest-native gtest-vendor-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_gtest/0.7.3-1.zip;downloadfilename=ament-cmake-gtest_0.7.3-1.zip"
SRC_URI[md5sum] = "f69d6bb5f2e2eaee025d64d9f57146a4"
SRC_URI[sha256sum] = "89a6636094fdaed30875fe5cc0421e91bfbbdd6341254e7ae4cae63dbfb71516"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_gtest-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

