
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " C++ API to access the ament resource index. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/dashing/ament_index_cpp/0.7.2-1.zip;downloadfilename=ament-index-cpp_0.7.2-1.zip"
SRC_URI[md5sum] = "a09f2e1bd69ead155d06d13fd85a21a4"
SRC_URI[sha256sum] = "0601efa6656ad4a0444631d746d1e0603bf89144ee85cc7ceee7f0696281d63b"

S = "${WORKDIR}/ament_index-release-release-dashing-ament_index_cpp-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

