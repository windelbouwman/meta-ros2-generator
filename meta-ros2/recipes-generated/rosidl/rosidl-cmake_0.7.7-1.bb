
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The CMake functionality to invoke code generation for ROS interface files."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native ament-cmake-python-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native python3-empy-native"
ROS_EXEC_DEPENDS = "rosidl-adapter rosidl-parser"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_cmake/0.7.7-1.zip;downloadfilename=rosidl-cmake_0.7.7-1.zip"
SRC_URI[md5sum] = "c0dfc47fe47b4f9fb011555f0c526d1d"
SRC_URI[sha256sum] = "685869efe42937bde8cf02b88998ffa0681c97f6a30947561b0705c821aa6efe"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_cmake-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

