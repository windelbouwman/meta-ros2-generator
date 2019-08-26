
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package which extends 'ros_core' and includes other basic functionalities like tf2 and urdf."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "kdl-parser robot-state-publisher ros-core tf2 tf2-eigen tf2-geometry-msgs tf2-kdl tf2-ros urdf"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/variants-release/archive/release/dashing/ros_base/0.7.2-1.zip;downloadfilename=ros-base_0.7.2-1.zip"
SRC_URI[md5sum] = "66012ca75f105a6b01fe339f4b4740b5"
SRC_URI[sha256sum] = "81640dd574507082eaa7ad1cb60c9eef895cd479ff2ff370533593bc9fc633bd"

S = "${WORKDIR}/variants-release-release-dashing-ros_base-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

