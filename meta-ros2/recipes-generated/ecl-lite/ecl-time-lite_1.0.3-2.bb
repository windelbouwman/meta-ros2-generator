
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides a portable set of time functions that are especially useful for porting other code or being wrapped by higher level c++ classes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/dashing/ecl_time_lite/1.0.3-2.zip;downloadfilename=ecl-time-lite_1.0.3-2.zip"
SRC_URI[md5sum] = "9f2772f4de9344ff2cdd2df2ab3346dc"
SRC_URI[sha256sum] = "7de0658be63e865671cee39fbac1db554df06238957a445132a049e291119b6a"

S = "${WORKDIR}/ecl_lite-release-release-dashing-ecl_time_lite-1.0.3-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

