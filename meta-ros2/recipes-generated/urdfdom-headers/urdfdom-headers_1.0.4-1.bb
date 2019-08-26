
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " C++ headers for URDF. "
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/urdfdom_headers-release/archive/release/dashing/urdfdom_headers/1.0.4-1.zip;downloadfilename=urdfdom-headers_1.0.4-1.zip"
SRC_URI[md5sum] = "d9160d9c6bc0c4b23dbbea59466149af"
SRC_URI[sha256sum] = "94137e34f0ccd2e1595500969f2f1e207428fb9a178705cd5e8f016d96a38ee3"

S = "${WORKDIR}/urdfdom_headers-release-release-dashing-urdfdom_headers-1.0.4-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

