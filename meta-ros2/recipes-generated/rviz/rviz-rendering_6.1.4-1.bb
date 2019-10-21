
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Library which provides the 3D rendering functionality in rviz. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp eigen qtbase5-dev resource-retriever rviz-assimp-vendor rviz-ogre-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native eigen3-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen qtbase5-dev rviz-ogre-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = "eigen3-cmake-module-native"
ROS_EXEC_DEPENDS = "ament-index-cpp libqt5-core libqt5-gui libqt5-opengl libqt5-widgets resource-retriever rviz-assimp-vendor rviz-ogre-vendor"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-gmock ament-cmake-gtest ament-cmake-lint-cmake ament-cmake-uncrustify rviz-assimp-vendor"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_rendering/6.1.4-1.zip;downloadfilename=rviz-rendering_6.1.4-1.zip"
SRC_URI[md5sum] = "678f9f626824848a910a81b33fdb8b86"
SRC_URI[sha256sum] = "5cb5a07af69ec91130168a675ba61526ecf9e435694de42cecd0e832c91b7298"

S = "${WORKDIR}/rviz-release-release-dashing-rviz_rendering-6.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

