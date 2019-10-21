
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "C++ Demo applications for Quality of Service features"
SECTION = "devel"

ROS_BUILD_DEPENDS = "example-interfaces rclcpp rcutils rmw rmw-implementation-cmake std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces launch-ros rclcpp rcutils rmw std-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/quality_of_service_demo_cpp/0.7.9-1.zip;downloadfilename=quality-of-service-demo-cpp_0.7.9-1.zip"
SRC_URI[md5sum] = "af0a887faa986ef15bcb2c8d09fc4b2e"
SRC_URI[sha256sum] = "9b165941a6cdc46c4013b6c8910ca19b8cf1e89a436b555ce654164ef42a7b55"

S = "${WORKDIR}/demos-release-release-dashing-quality_of_service_demo_cpp-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

