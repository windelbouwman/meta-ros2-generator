
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A handful of useful utility functions for nav_2d packages."
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs nav-2d-msgs nav-msgs nav2-common nav2-msgs tf2 tf2-geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs nav-2d-msgs nav-msgs nav2-msgs tf2 tf2-geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs nav-2d-msgs nav-msgs nav2-msgs tf2 tf2-geometry-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav_2d_utils/0.2.3-1.zip;downloadfilename=nav-2d-utils_0.2.3-1.zip"
SRC_URI[md5sum] = "27f2ac82c6502fe884c9fadc09fe2709"
SRC_URI[sha256sum] = "89ae26685f9baa4c871a236d0f48fa4f8b4cce957122058ba7b40582cc294b64"

S = "${WORKDIR}/navigation2-release-release-dashing-nav_2d_utils-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

