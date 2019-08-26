
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provide CMake module with extra functionality for Python."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "python3-dev-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/python_cmake_module/0.7.7-1.zip;downloadfilename=python-cmake-module_0.7.7-1.zip"
SRC_URI[md5sum] = "dbf49281dceb8c7d0d9b0c18050262de"
SRC_URI[sha256sum] = "d35bbff5fa398977f8edf3cb32ded890383d9c2495f511efdef31884b0ea2641"

S = "${WORKDIR}/rosidl_python-release-release-dashing-python_cmake_module-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

