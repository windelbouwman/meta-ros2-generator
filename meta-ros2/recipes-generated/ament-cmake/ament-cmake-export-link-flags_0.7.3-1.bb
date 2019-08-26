
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to export link flags to downstream packages in the ament buildsystem."
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_export_link_flags/0.7.3-1.zip;downloadfilename=ament-cmake-export-link-flags_0.7.3-1.zip"
SRC_URI[md5sum] = "bd3352ca3f46a42cd63dd95e37703640"
SRC_URI[sha256sum] = "b7cfbfab1f926929b63ecaa1cbcf6c72432d03368348b9914b37252672527ea3"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_export_link_flags-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

