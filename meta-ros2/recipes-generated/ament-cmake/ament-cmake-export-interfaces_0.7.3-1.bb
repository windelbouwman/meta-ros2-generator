
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to export interfaces to downstream packages in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native ament-cmake-export-libraries-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_export_interfaces/0.7.3-1.zip;downloadfilename=ament-cmake-export-interfaces_0.7.3-1.zip"
SRC_URI[md5sum] = "1b043538b04a87df88d9c59b1f025595"
SRC_URI[sha256sum] = "4afaf2b983a1d0bb3b49a28a3dbe9f1f6b0102142cb2dc7c4feb295892acb29b"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_export_interfaces-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

