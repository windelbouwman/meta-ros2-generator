
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/pendulum_msgs/0.7.9-1.zip;downloadfilename=pendulum-msgs_0.7.9-1.zip"
SRC_URI[md5sum] = "3e39fcad4d5731b8c4ed092ca5a1de05"
SRC_URI[sha256sum] = "ab757884d5b52a1a76df5230c9d91caac7f912937d7335b90ab4d2cae2397a1f"

S = "${WORKDIR}/demos-release-release-dashing-pendulum_msgs-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

