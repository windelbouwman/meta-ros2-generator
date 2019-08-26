
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Testing tools for C++, and is used in various OSRF projects."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/dashing/osrf_testing_tools_cpp/1.2.1-1.zip;downloadfilename=osrf-testing-tools-cpp_1.2.1-1.zip"
SRC_URI[md5sum] = "4614ade4a84e2e9290d2648d4adeb84a"
SRC_URI[sha256sum] = "51dd0cd24cffca03938ff50575697f722083248593691e7ed646fd43db72cfd2"

S = "${WORKDIR}/osrf_testing_tools_cpp-release-release-dashing-osrf_testing_tools_cpp-1.2.1-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

