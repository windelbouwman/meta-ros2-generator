
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " These tools inspect and describe your system with macros, types and functions. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-license"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_config/1.0.1-1.zip;downloadfilename=ecl-config_1.0.1-1.zip"
SRC_URI[md5sum] = "eb9be34db06353f29122d8a813c65871"
SRC_URI[sha256sum] = "e5d33ce281632f6d02f2dbc9bed06fded41eddf64392287ee3ee823f3734e2f2"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_config-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

