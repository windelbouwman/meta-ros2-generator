
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Asynchronous Web/WebSocket Server in C++"
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost libssl-dev"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "boost libssl-dev"
ROS_TEST_DEPENDS = "launch-testing python3-websocket"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/async_web_server_cpp-release/archive/release/dashing/async_web_server_cpp/1.0.0-1.zip;downloadfilename=async-web-server-cpp_1.0.0-1.zip"
SRC_URI[md5sum] = "7f298a06dfd02e2bf652cbc564ac7098"
SRC_URI[sha256sum] = "c1838d95d18d1094ebc3b062aa62db63d79d2ae737867a6f4664a9ee826645ea"

S = "${WORKDIR}/async_web_server_cpp-release-release-dashing-async_web_server_cpp-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

