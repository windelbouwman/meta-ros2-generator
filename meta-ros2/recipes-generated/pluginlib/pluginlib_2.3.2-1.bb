
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The pluginlib package provides tools for writing and dynamically loading plugins using the ROS build infrastructure. To work, these tools require plugin providers to register their plugins in the package.xml of their package. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp class-loader rcutils tinyxml2-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp class-loader rcutils tinyxml2-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp class-loader rcutils tinyxml2-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/pluginlib-release/archive/release/dashing/pluginlib/2.3.2-1.zip;downloadfilename=pluginlib_2.3.2-1.zip"
SRC_URI[md5sum] = "e206b79a978f902a5ad2a13eea41809e"
SRC_URI[sha256sum] = "a302c626d746dea9d0a1fb7522c56631349f37e866b92048981366eac49007d7"

S = "${WORKDIR}/pluginlib-release-release-dashing-pluginlib-2.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

