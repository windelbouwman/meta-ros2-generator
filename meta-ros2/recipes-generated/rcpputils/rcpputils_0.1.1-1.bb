
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing utility code for C++. Currently only Clang thread safety annotation macros"
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcpputils-release/archive/release/dashing/rcpputils/0.1.1-1.zip;downloadfilename=rcpputils_0.1.1-1.zip"
SRC_URI[md5sum] = "6499d24c622c1845dab4cf8e88cf29fd"
SRC_URI[sha256sum] = "81214749d5f1c93446a1b0dd36dfd8127a5add6f3045fbf41c277fc3b3b9c4c5"

S = "${WORKDIR}/rcpputils-release-release-dashing-rcpputils-0.1.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

