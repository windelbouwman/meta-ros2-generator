
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A WebSocket interface to rosbridge."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-tornado python3-twisted rclpy rosapi rosauth rosbridge-library rosbridge-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rosbridge_suite-release/archive/release/dashing/rosbridge_server/1.0.2-1.zip;downloadfilename=rosbridge-server_1.0.2-1.zip"
SRC_URI[md5sum] = "ad6fa06c4adee214beb72347509d6fe5"
SRC_URI[sha256sum] = "1b8915876081ed25b89e127151186e32a68d181727b5c6214d55671d39b78f74"

S = "${WORKDIR}/rosbridge_suite-release-release-dashing-rosbridge_server-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

