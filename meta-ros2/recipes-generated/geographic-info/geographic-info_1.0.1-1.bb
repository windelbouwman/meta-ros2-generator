
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Geographic information metapackage.  Not needed for wet packages, use only to resolve dry stack dependencies. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geodesy geographic-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geodesy geographic-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geodesy geographic-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/dashing/geographic_info/1.0.1-1.zip;downloadfilename=geographic-info_1.0.1-1.zip"
SRC_URI[md5sum] = "61ae888db2f5657e5c48369cb2963cdb"
SRC_URI[sha256sum] = "83ca126c0d625a1febd426965f680370c79e1d0b17d94bb54c667b5a51cc533b"

S = "${WORKDIR}/geographic_info-release-release-dashing-geographic_info-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

