
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Custom messages for real-time pendulum control."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces rosidl-default-generators"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/pendulum_msgs/0.7.8-1.zip;downloadfilename=pendulum-msgs_0.7.8-1.zip"
SRC_URI[md5sum] = "826dda521fbaaa9ab07523c5d03c4222"
SRC_URI[sha256sum] = "c3a8bb661eb8387e7e89f16b634dd3cf83f83e5f627ef20c4f93801151013cfe"

S = "${WORKDIR}/demos-release-release-dashing-pendulum_msgs-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

