
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Messages relating to the ROS Computation Graph. These are generally considered to be low-level messages that end users do not interact with. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/rosgraph_msgs/0.7.4-1.zip;downloadfilename=rosgraph-msgs_0.7.4-1.zip"
SRC_URI[md5sum] = "6390671ddf8ff2210af3f1e3e80d3797"
SRC_URI[sha256sum] = "799f0a0c20664fdaf37544ae146072571a076340394963bb8425344f7b637a59"

S = "${WORKDIR}/rcl_interfaces-release-release-dashing-rosgraph_msgs-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

