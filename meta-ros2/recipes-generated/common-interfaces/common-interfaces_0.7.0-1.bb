
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "common_interfaces contains messages and services that are widely used by other ROS packages."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "actionlib-msgs builtin-interfaces diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs trajectory-msgs visualization-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/common_interfaces/0.7.0-1.zip;downloadfilename=common-interfaces_0.7.0-1.zip"
SRC_URI[md5sum] = "fea78991b6f0f104ceecd508d957656a"
SRC_URI[sha256sum] = "c5e15ccb4599d5834e86dc141e1bf79561e2d581c89d698beaa9f14cac4dad88"

S = "${WORKDIR}/common_interfaces-release-release-dashing-common_interfaces-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

