
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " 3D testing framework for RViz. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake-gtest qtbase5-dev rviz-common"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-cmake-gtest rviz-common"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake-gtest rviz-common"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-gmock ament-cmake-lint-cmake ament-cmake-uncrustify"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_visual_testing_framework/6.1.4-1.zip;downloadfilename=rviz-visual-testing-framework_6.1.4-1.zip"
SRC_URI[md5sum] = "0eb0a5e3aad3ee62638467b82fd19b8c"
SRC_URI[sha256sum] = "c53b7e5cfc4c002ba946c375251372cdb492211217dfeeb38c1f6e2db93663ba"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_visual_testing_framework-6.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

