
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "This package provides a set of typedef's that allow using Eigen datatypes in STL containers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/eigen_stl_containers-release/archive/release/dashing/eigen_stl_containers/1.0.0-1.zip;downloadfilename=eigen-stl-containers_1.0.0-1.zip"
SRC_URI[md5sum] = "8960a4100bebf8d297290af216b3460f"
SRC_URI[sha256sum] = "986558f59e57b7ba3823cc83ba8673a1a8a749abd435b785a9c6075dd08cfa96"

S = "${WORKDIR}/eigen_stl_containers-release-release-dashing-eigen_stl_containers-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

