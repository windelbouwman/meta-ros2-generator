
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


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_rendering_tests/6.1.3-1.zip;downloadfilename=rviz-rendering-tests_6.1.3-1.zip"
SRC_URI[md5sum] = "bf4e3b6f23e396a9dc275572ea150d0a"
SRC_URI[sha256sum] = "75bd6a747bc321cc49ad95313253536ae0be8fa768ca37cb211979cc7f08f722"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_rendering_tests-6.1.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

