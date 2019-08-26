
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Cartographer is a system that provides real-time simultaneous localization and mapping (SLAM) in 2D and 3D across multiple platforms and sensor configurations. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost eigen g++-static google-mock libcairo2-dev libceres-dev libgflags-dev libgoogle-glog-dev lua5.2-dev protobuf-dev python-sphinx"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "boost eigen libcairo2-dev libceres-dev libgflags-dev libgoogle-glog-dev lua5.2-dev protobuf-dev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "boost eigen libcairo2-dev libceres-dev libgflags-dev libgoogle-glog-dev lua5.2-dev protobuf-dev"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"


SRC_URI = "https://github.com/ros2-gbp/cartographer-release/archive/release/dashing/cartographer/1.0.0-1.zip;downloadfilename=cartographer_1.0.0-1.zip"
SRC_URI[md5sum] = "825d0cd05f2764c264e5fa064dc9c309"
SRC_URI[sha256sum] = "1dac82fa2db511fd94b99962c0328aee2c20606eab00e075593a76caffa6ed95"

S = "${WORKDIR}/cartographer-release-release-dashing-cartographer-1.0.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

