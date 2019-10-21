
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The containers included here are intended to extend the stl containers. In all cases, these implementations are designed to implement c++ conveniences and safety where speed is not sacrificed.  Also includes techniques for memory debugging of common problems such as buffer overruns. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-converters ecl-errors ecl-exceptions ecl-formatters ecl-license ecl-mpl ecl-type-traits ecl-utilities"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-converters ecl-errors ecl-exceptions ecl-formatters ecl-license ecl-mpl ecl-type-traits ecl-utilities"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_containers/1.0.4-1.zip;downloadfilename=ecl-containers_1.0.4-1.zip"
SRC_URI[md5sum] = "33c60e4391272f0efb2371ae854c48a1"
SRC_URI[sha256sum] = "70d1da770d40d2aff634ad269127b5e8d595ff1af9b56d4141423ff80317e921"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_containers-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

