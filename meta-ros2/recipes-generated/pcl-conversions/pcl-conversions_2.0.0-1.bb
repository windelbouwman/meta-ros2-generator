
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces eigen libpcl-all-dev sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces eigen libpcl-all-dev sensor-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libpcl-all-dev"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/pcl_conversions-release/archive/release/dashing/pcl_conversions/2.0.0-1.zip;downloadfilename=pcl-conversions_2.0.0-1.zip"
SRC_URI[md5sum] = "d64fe687b00645397151134898556ffa"
SRC_URI[sha256sum] = "203a7e69407fdfb44362cb2daf0a165ebc599eb67ef2c3538d8a92d72c4b3cfe"

S = "${WORKDIR}/pcl_conversions-release-release-dashing-pcl_conversions-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

