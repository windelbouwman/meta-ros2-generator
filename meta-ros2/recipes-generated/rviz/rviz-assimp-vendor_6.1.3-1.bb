
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around assimp, providing nothing but a dependency on assimp, on some systems. On others, it provides a fixed CMake module or even an ExternalProject build of assimp. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "assimp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "assimp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "assimp"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_assimp_vendor/6.1.3-1.zip;downloadfilename=rviz-assimp-vendor_6.1.3-1.zip"
SRC_URI[md5sum] = "1d29f505eec19134b750f1e7b2eef71c"
SRC_URI[sha256sum] = "9ab5de611a3016b56b1d581d337bfc2d8c2952a4c1f49b63ebb8628a0f7b0669"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_assimp_vendor-6.1.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

