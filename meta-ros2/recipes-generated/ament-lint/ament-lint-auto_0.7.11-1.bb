
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_lint_auto/0.7.11-1.zip;downloadfilename=ament-lint-auto_0.7.11-1.zip"
SRC_URI[md5sum] = "45aa1648ec025a9630af3b4f98a4c2f9"
SRC_URI[sha256sum] = "ca43617922f11acc8ff57a613631603e7f3ed0e772de5896931d011f4b2bfcc2"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_lint_auto-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

