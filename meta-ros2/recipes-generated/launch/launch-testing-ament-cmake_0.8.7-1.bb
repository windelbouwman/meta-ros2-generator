
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package providing cmake functions for running launch tests from the build."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native launch-testing-native python-cmake-module-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-copyright"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/dashing/launch_testing_ament_cmake/0.8.7-1.zip;downloadfilename=launch-testing-ament-cmake_0.8.7-1.zip"
SRC_URI[md5sum] = "87b163473a32ee81ebcee19cfd426fbf"
SRC_URI[sha256sum] = "cd38fba9241ef050c67490d3ed9475c12ad168241dc1e3eb01581cb93545845d"

S = "${WORKDIR}/launch-release-release-dashing-launch_testing_ament_cmake-0.8.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

