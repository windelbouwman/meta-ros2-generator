
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


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_geometry/1.0.1-1.zip;downloadfilename=ecl-geometry_1.0.1-1.zip"
SRC_URI[md5sum] = "f2012de574191f3eb71210e4b228f305"
SRC_URI[sha256sum] = "4a423badd53b0bab109dd2badee1ef49574336b57b372c2ae95cf5b00568d58f"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_geometry-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

