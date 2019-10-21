
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "tf2_eigen"
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen geometry-msgs tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native eigen3-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen geometry-msgs tf2 tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = "eigen3-cmake-module-native"
ROS_EXEC_DEPENDS = "geometry-msgs tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_eigen/0.11.5-1.zip;downloadfilename=tf2-eigen_0.11.5-1.zip"
SRC_URI[md5sum] = "39337cf21913919bdcefe8f522447604"
SRC_URI[sha256sum] = "cc9f45e5d15b363d77fe6053bd2f7d5c967c32146c465bb5ad5f2ee0a724b296"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_eigen-0.11.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

