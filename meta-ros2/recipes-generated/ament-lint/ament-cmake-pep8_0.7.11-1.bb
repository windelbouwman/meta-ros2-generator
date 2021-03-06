
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The CMake API for ament_pep8 to check code against the style conventions in PEP 8. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-test-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-test-native ament-pep8-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-copyright ament-cmake-lint-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cmake_pep8/0.7.11-1.zip;downloadfilename=ament-cmake-pep8_0.7.11-1.zip"
SRC_URI[md5sum] = "6bcaf0839c2a6a8dec0ca5b88c202d7e"
SRC_URI[sha256sum] = "81766569e92b3f45ed48aa4c023fe96c5b6cf60e88d381f2112b17a360a38ea1"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cmake_pep8-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

