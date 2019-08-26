
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The auto-magic functions for ease to use of the ament linters in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-test-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native ament-cmake-test-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_lint_auto/0.7.7-1.zip;downloadfilename=ament-lint-auto_0.7.7-1.zip"
SRC_URI[md5sum] = "76b1cd148761cb21520814f4f4ebe03c"
SRC_URI[sha256sum] = "4488a3f5da3bee41fd356d63062527f87fc5bfaebc9cb2c99e4f81206833c8e8"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_lint_auto-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

