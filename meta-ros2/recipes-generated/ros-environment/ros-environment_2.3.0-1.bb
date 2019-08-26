
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The package provides the environment variables `ROS_VERSION` and `ROS_DISTRO`."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros_environment-release/archive/release/dashing/ros_environment/2.3.0-1.zip;downloadfilename=ros-environment_2.3.0-1.zip"
SRC_URI[md5sum] = "42da9da82835a30f19ec58dfb8d57cf2"
SRC_URI[sha256sum] = "bae1a90248abcc1d2a6486aeb3603c6ebc17d941e28b1bc1142cebf38fc9adc9"

S = "${WORKDIR}/ros_environment-release-release-dashing-ros_environment-2.3.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

