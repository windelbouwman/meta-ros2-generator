
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/quality_of_service_demo_cpp/0.7.8-1.zip;downloadfilename=quality-of-service-demo-cpp_0.7.8-1.zip"
SRC_URI[md5sum] = "94fd12ec9024796a985569289894e2c9"
SRC_URI[sha256sum] = "ce4212b968fc369130eacaac363ce0880d2385adf566d749df1368972a213d6a"

S = "${WORKDIR}/demos-release-release-dashing-quality_of_service_demo_cpp-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

