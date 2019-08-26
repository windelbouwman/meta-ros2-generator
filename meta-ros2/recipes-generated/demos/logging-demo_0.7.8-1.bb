
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/logging_demo/0.7.8-1.zip;downloadfilename=logging-demo_0.7.8-1.zip"
SRC_URI[md5sum] = "9e4f8dea9bb8c630f92d3fa17efda01b"
SRC_URI[sha256sum] = "51893976a483e438b7fb4c1d173d988db10f1188278a93e8fb9becf7803ede4b"

S = "${WORKDIR}/demos-release-release-dashing-logging_demo-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

