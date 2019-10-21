
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Any tools relating to mathematical geometry. Primarily featuring polynomials and interpolations. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-containers ecl-exceptions ecl-formatters ecl-license ecl-linear-algebra ecl-math ecl-mpl ecl-type-traits"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-config ecl-containers ecl-exceptions ecl-formatters ecl-license ecl-linear-algebra ecl-math ecl-mpl ecl-type-traits"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_geometry/1.0.4-1.zip;downloadfilename=ecl-geometry_1.0.4-1.zip"
SRC_URI[md5sum] = "5a14348ae0a4ff660e53fa496db57add"
SRC_URI[sha256sum] = "108fd6c7514c86ebcd2f69a00c0a6c91116ccf78b18dbd946b9e637206684a80"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_geometry-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

