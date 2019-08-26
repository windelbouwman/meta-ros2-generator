
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Introduces a compile time concept checking mechanism that can be used most commonly to check for required functionality when passing template arguments. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-license ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-license ecl-type-traits"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_concepts/1.0.1-1.zip;downloadfilename=ecl-concepts_1.0.1-1.zip"
SRC_URI[md5sum] = "89b8be06c07aaf3deacd31ca2e413efd"
SRC_URI[sha256sum] = "a26eb2e013758c81a26d1dd5e671138a2b2741a28f47cde655aaad577b2e7fee"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_concepts-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

