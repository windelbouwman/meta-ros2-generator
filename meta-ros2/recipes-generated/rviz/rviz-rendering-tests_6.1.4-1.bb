
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Example plugin for RViz - documents and tests RViz plugin development "
SECTION = "devel"

ROS_BUILD_DEPENDS = "qtbase5-dev resource-retriever rviz-rendering"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "resource-retriever rviz-rendering"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "resource-retriever rviz-rendering"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-gmock ament-cmake-gtest ament-cmake-lint-cmake ament-cmake-uncrustify ament-index-cpp"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=01c2bc31767ccb3a68e12f02612b2a97"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_rendering_tests/6.1.4-1.zip;downloadfilename=rviz-rendering-tests_6.1.4-1.zip"
SRC_URI[md5sum] = "e37211ead690d8b32ae6d8f2646ac308"
SRC_URI[sha256sum] = "1577c582514b3a9fd169563aa36d3ace81e8e29b72835aeadf3e5ae81691377f"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_rendering_tests-6.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

