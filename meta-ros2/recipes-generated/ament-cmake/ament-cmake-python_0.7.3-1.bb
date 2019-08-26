
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to use Python in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_python/0.7.3-1.zip;downloadfilename=ament-cmake-python_0.7.3-1.zip"
SRC_URI[md5sum] = "f87bce73e1e9e4a596b8cc2478c556a1"
SRC_URI[sha256sum] = "fc2d89e8c0756a1e38067543146d6ea04f2f96149cf93c2f130443ddf6d17fb3"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_python-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

