
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A handful of useful utility functions for nav_2d packages."
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs nav-2d-msgs nav-msgs nav2-common nav2-msgs nav2-util tf2 tf2-geometry-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs nav-2d-msgs nav-msgs nav2-msgs nav2-util tf2 tf2-geometry-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs nav-2d-msgs nav-msgs nav2-msgs nav2-util tf2 tf2-geometry-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav_2d_utils/0.2.6-1.zip;downloadfilename=nav-2d-utils_0.2.6-1.zip"
SRC_URI[md5sum] = "ce42e4ee576d771bbb65bf8bd01f9287"
SRC_URI[sha256sum] = "f8ec48d8ef8e2e9be3b6ffaa47e774d6843c726f27bdce64e98bcf3c59b3b5d9"

S = "${WORKDIR}/navigation2-release-release-dashing-nav_2d_utils-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

