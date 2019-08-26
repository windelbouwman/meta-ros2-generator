
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The auto-magic functions for ease to use of the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_auto/0.7.3-1.zip;downloadfilename=ament-cmake-auto_0.7.3-1.zip"
SRC_URI[md5sum] = "e605baecb40b38259530947ed6fa39cc"
SRC_URI[sha256sum] = "1fbe69433266e57343e85435964484d82e9735ba6b17e512b8d525629316ca6d"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_auto-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

