
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_converters_lite/1.0.1-1.zip;downloadfilename=ecl-converters-lite_1.0.1-1.zip"
SRC_URI[md5sum] = "1cbb4ec2c76a3fbdfe7422640488b9b6"
SRC_URI[sha256sum] = "ef413e442913418b51a9736387e19f1d5fafd69778aa26f1ed3df4d5dbdec5ec"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_converters_lite-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

