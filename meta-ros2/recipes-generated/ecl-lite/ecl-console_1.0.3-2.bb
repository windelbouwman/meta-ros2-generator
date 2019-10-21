
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Color codes for ansii consoles. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-config ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_console/1.0.3-2.zip;downloadfilename=ecl-console_1.0.3-2.zip"
SRC_URI[md5sum] = "82fa05d74230bb0a5772a0d364c17ba1"
SRC_URI[sha256sum] = "eedb9ee581eec843c749fa0b69d31f15629079e44f89e641a3743e4641e0b756"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_console-1.0.3-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

