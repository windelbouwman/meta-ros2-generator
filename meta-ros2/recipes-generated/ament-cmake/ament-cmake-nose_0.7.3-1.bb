
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to add nose-based tests in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native ament-cmake-test-native python3-nose-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_nose/0.7.3-1.zip;downloadfilename=ament-cmake-nose_0.7.3-1.zip"
SRC_URI[md5sum] = "c885e75ae4995bb3f4505cbbce308789"
SRC_URI[sha256sum] = "4f7a6c2f60029e23840b3710f8019d9552e586381fc6ee69620c7d92f41939f6"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_nose-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

