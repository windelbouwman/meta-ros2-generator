
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to export include directories to downstream packages in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_export_include_directories/0.7.3-1.zip;downloadfilename=ament-cmake-export-include-directories_0.7.3-1.zip"
SRC_URI[md5sum] = "76d8de5f9b0543a3bdce3d139baca582"
SRC_URI[sha256sum] = "ba91c5c8a0abc8bea375645dbf1d5730fdfe28d20156603525c79f85792d2fbf"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_export_include_directories-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

