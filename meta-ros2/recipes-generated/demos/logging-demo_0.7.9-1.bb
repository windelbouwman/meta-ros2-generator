
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples for using and configuring loggers."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp rclcpp-components rcutils rosidl-cmake std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rclcpp-components rcutils rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake launch-testing-ros rmw-implementation-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/logging_demo/0.7.9-1.zip;downloadfilename=logging-demo_0.7.9-1.zip"
SRC_URI[md5sum] = "6f0cbc4efa199aa6f0cca4662cb0604d"
SRC_URI[sha256sum] = "55d144ad3b8dcab52d50538a59880aa990069d3ee90b33ca016a2ea0984424df"

S = "${WORKDIR}/demos-release-release-dashing-logging_demo-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

