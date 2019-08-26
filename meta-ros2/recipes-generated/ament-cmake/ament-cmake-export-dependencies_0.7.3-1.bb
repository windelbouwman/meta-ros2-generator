
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to export dependencies to downstream packages in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native ament-cmake-libraries-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_export_dependencies/0.7.3-1.zip;downloadfilename=ament-cmake-export-dependencies_0.7.3-1.zip"
SRC_URI[md5sum] = "dd23ba8727c6e022d4852ad030b1ee15"
SRC_URI[sha256sum] = "80ae75a551c615d90b5f8856c938d95ebed4a4ee056f7de586f980a1a03c540a"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_export_dependencies-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

