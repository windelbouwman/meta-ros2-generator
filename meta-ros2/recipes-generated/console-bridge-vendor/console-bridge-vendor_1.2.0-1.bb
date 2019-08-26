
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around console_bridge, providing nothing but a dependency on console_bridge, on some systems. On others, it provides an ExternalProject build of console_bridge. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "libconsole-bridge-dev"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libconsole-bridge-dev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libconsole-bridge-dev"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/console_bridge_vendor-release/archive/release/dashing/console_bridge_vendor/1.2.0-1.zip;downloadfilename=console-bridge-vendor_1.2.0-1.zip"
SRC_URI[md5sum] = "899bee2f4ed644fd51d0206a26010ee2"
SRC_URI[sha256sum] = "31e2bcb40b4223823748a16f79cbf1c0ae5f806a45ca29a266b8a66c0eca7240"

S = "${WORKDIR}/console_bridge_vendor-release-release-dashing-console_bridge_vendor-1.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

