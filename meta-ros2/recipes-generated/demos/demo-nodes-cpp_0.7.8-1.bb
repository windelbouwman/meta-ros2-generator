
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " C++ nodes which were previously in the ros2/examples repository but are now just used for demo purposes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "example-interfaces rclcpp rcutils rmw rmw-implementation-cmake std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces launch-ros rclcpp rcutils rmw std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake launch-testing-ros"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/demo_nodes_cpp/0.7.8-1.zip;downloadfilename=demo-nodes-cpp_0.7.8-1.zip"
SRC_URI[md5sum] = "cbbb19fbaa4ebfb2f78acb28fa403858"
SRC_URI[sha256sum] = "af478e40ee1fa42dad954ae608fcbfe3b7ef65dc8118d57c4f88817ca04da9e8"

S = "${WORKDIR}/demos-release-release-dashing-demo_nodes_cpp-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

