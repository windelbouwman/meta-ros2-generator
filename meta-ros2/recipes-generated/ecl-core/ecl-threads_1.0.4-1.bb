
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides the c++ extensions for a variety of threaded programming tools. These are usually different on different platforms, so the architecture for a cross-platform framework is also implemented. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-time ecl-utilities"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-time ecl-utilities"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_threads/1.0.4-1.zip;downloadfilename=ecl-threads_1.0.4-1.zip"
SRC_URI[md5sum] = "420661ee6f29ab1d862e76598547ed68"
SRC_URI[sha256sum] = "4a37b5794fc84564b45ccdf5bea8b9680552fd7c8156c156db22581cefefddc1"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_threads-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

