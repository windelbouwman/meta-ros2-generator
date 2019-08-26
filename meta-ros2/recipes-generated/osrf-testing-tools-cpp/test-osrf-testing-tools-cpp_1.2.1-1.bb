
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Test package, which uses things exported by osrf_testing_tools_cpp."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "osrf-testing-tools-cpp"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/dashing/test_osrf_testing_tools_cpp/1.2.1-1.zip;downloadfilename=test-osrf-testing-tools-cpp_1.2.1-1.zip"
SRC_URI[md5sum] = "8939ae2021cbc9fbe51a66891b873554"
SRC_URI[sha256sum] = "de1f3c814543e521fb0b8036381d181770970c8bbd528d4acd498aa43dbe2022"

S = "${WORKDIR}/osrf_testing_tools_cpp-release-release-dashing-test_osrf_testing_tools_cpp-1.2.1-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

