
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Ecl frontend to a linear matrix package (currently eigen). "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-converters ecl-eigen ecl-exceptions ecl-formatters ecl-license ecl-math sophus"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-converters ecl-eigen ecl-exceptions ecl-formatters ecl-license ecl-math sophus"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_linear_algebra/1.0.4-1.zip;downloadfilename=ecl-linear-algebra_1.0.4-1.zip"
SRC_URI[md5sum] = "1c503a8189a78e39cb24608fc7369c01"
SRC_URI[sha256sum] = "1534dac485782da0885fea7cd1de0926788224687bd4129583f84b4e8b7a4ab1"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_linear_algebra-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

