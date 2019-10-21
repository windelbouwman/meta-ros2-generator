
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A cross compilation tool for ROS 2 packages."
SECTION = "devel"

ROS_BUILD_DEPENDS = "python3-docker"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "python3-docker"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-docker"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/ros-tooling/cross_compile-release/archive/release/dashing/cross_compile/0.1.1-1.zip;downloadfilename=cross-compile_0.1.1-1.zip"
SRC_URI[md5sum] = "c0a68d268ae5a1fad1d1e92d8718c587"
SRC_URI[sha256sum] = "1e41a001daea395dbddaa5c4d3af84ccfcbd084f29be6af1fdf1521120d700a0"

S = "${WORKDIR}/cross_compile-release-release-dashing-cross_compile-0.1.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

