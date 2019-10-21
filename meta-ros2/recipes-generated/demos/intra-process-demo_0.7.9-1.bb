
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Demonstrations of intra process communication."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libopencv-dev rclcpp sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libopencv-dev rclcpp sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake rmw-implementation-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/intra_process_demo/0.7.9-1.zip;downloadfilename=intra-process-demo_0.7.9-1.zip"
SRC_URI[md5sum] = "e27fe18af0af9c1e9bae080f9f05542b"
SRC_URI[sha256sum] = "a7c05586966c246478e2e7b1d9d82003242d63904c1fd37bb3827f80d5c0b2d2"

S = "${WORKDIR}/demos-release-release-dashing-intra_process_demo-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

