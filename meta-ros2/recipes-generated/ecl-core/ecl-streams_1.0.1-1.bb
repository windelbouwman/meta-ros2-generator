
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " These are lightweight text streaming classes that connect to standardised ecl type devices. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-concepts ecl-converters ecl-devices ecl-errors ecl-license ecl-time ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-concepts ecl-converters ecl-devices ecl-errors ecl-license ecl-time ecl-type-traits"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_streams/1.0.1-1.zip;downloadfilename=ecl-streams_1.0.1-1.zip"
SRC_URI[md5sum] = "15a348035396d7a58bef25b3603af536"
SRC_URI[sha256sum] = "8333759c79c1a0915538758b66082c7204cef51302981573658cbd6e10c1ee6b"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_streams-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

