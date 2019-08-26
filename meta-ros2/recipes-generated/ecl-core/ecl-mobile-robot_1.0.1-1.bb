
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Contains transforms (e.g. differential drive inverse kinematics) for the various types of mobile robot platforms. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-errors ecl-formatters ecl-geometry ecl-license ecl-linear-algebra ecl-math"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-errors ecl-formatters ecl-geometry ecl-license ecl-linear-algebra ecl-math"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_mobile_robot/1.0.1-1.zip;downloadfilename=ecl-mobile-robot_1.0.1-1.zip"
SRC_URI[md5sum] = "150d3a70d708bad63d22b76870112b2d"
SRC_URI[sha256sum] = "191aa230376807b56c7d2c327ab6bf91af1d9130f60674b6f13920f17a57ae0c"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_mobile_robot-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

