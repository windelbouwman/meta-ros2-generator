
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This provides an Eigen implementation for ecl's linear algebra. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "eigen"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_eigen/1.0.1-1.zip;downloadfilename=ecl-eigen_1.0.1-1.zip"
SRC_URI[md5sum] = "10fb2d1cb8649cbc04f42216b3541ca0"
SRC_URI[sha256sum] = "25779f8c68467ec36bf7ee55186c7bf74d6beba0e9e3a1a5577e77cdac6996e6"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_eigen-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

