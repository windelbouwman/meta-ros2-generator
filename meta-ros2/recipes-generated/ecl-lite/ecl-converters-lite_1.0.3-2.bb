
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " These are a very simple version of some of the functions in ecl_converters suitable for firmware development. That is, there is no use of new, templates or exceptions. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-config ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-license"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_converters_lite/1.0.3-2.zip;downloadfilename=ecl-converters-lite_1.0.3-2.zip"
SRC_URI[md5sum] = "aecdb95bca744779760bae7d3ca89376"
SRC_URI[sha256sum] = "c6014fe0cc86a06fd86ab4d98e779b7e73e8f37ca934686e5c8b2fe5d0b13c68"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_converters_lite-1.0.3-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

