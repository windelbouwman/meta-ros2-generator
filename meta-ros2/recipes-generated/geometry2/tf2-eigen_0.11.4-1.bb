
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "tf2_eigen"
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen geometry-msgs tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen geometry-msgs tf2 tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_eigen/0.11.4-1.zip;downloadfilename=tf2-eigen_0.11.4-1.zip"
SRC_URI[md5sum] = "32d70604fef8a9c10c3eef920998f4da"
SRC_URI[sha256sum] = "6a913c759cbed6e3373d25a872244ce39a020a1017a5864a3d82825a272836b3"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_eigen-0.11.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

