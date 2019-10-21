
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


SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/python_cmake_module/0.7.9-1.zip;downloadfilename=python-cmake-module_0.7.9-1.zip"
SRC_URI[md5sum] = "7fa72885e6859436be653cd35f064038"
SRC_URI[sha256sum] = "3aa72d794f2d8329e76d70464860112dc6728825f140bc1c9b1d2a6cd0f7aa64"

S = "${WORKDIR}/rosidl_python-release-release-dashing-python_cmake_module-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

