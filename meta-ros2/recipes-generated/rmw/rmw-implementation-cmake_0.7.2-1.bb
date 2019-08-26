
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " CMake functions which can discover and enumerate available implementations. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw-release/archive/release/dashing/rmw_implementation_cmake/0.7.2-1.zip;downloadfilename=rmw-implementation-cmake_0.7.2-1.zip"
SRC_URI[md5sum] = "5fff5eb0a7e98e1d816231373d4d7917"
SRC_URI[sha256sum] = "ee977d52d6f501db21428bf7697356aaf17b6c5917720b13dec232da66efb64a"

S = "${WORKDIR}/rmw-release-release-dashing-rmw_implementation_cmake-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

