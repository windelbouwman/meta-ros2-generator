
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Embeds the TCLAP library inside the ecl. This is a very convenient command line parser in templatised c++. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-license"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_command_line/1.0.4-1.zip;downloadfilename=ecl-command-line_1.0.4-1.zip"
SRC_URI[md5sum] = "e13eaf33dcd52083db3903b999760969"
SRC_URI[sha256sum] = "31c99bd3548e8c7b4dd202bc1c58d4ef8b1fa7c6820af706d8a2d37fe0cc162d"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_command_line-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

