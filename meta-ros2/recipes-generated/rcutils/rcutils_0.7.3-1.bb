
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing various utility types and functions for C"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native python3-empy-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake osrf-testing-tools-cpp"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcutils-release/archive/release/dashing/rcutils/0.7.3-1.zip;downloadfilename=rcutils_0.7.3-1.zip"
SRC_URI[md5sum] = "ce739c7f4e56217271a4373459a97f48"
SRC_URI[sha256sum] = "8ef168da1dc7f87d49d1a91fbcf5deeddea0aafd07650019a054c2388ac5e391"

S = "${WORKDIR}/rcutils-release-release-dashing-rcutils-0.7.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

