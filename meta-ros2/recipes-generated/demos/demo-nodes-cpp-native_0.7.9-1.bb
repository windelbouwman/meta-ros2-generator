
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " C++ nodes which access the native handles of the rmw implemenation. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp rmw-fastrtps-cpp std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp rmw-fastrtps-cpp std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rmw-fastrtps-cpp std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake launch-testing-ros"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/demo_nodes_cpp_native/0.7.9-1.zip;downloadfilename=demo-nodes-cpp-native_0.7.9-1.zip"
SRC_URI[md5sum] = "92143804fab2fc4e7bda8f395808f4fa"
SRC_URI[sha256sum] = "41ef4e8eaddef71181f57dc09550b93e33543c7d806d0170dd4d916d7fb04ef1"

S = "${WORKDIR}/demos-release-release-dashing-demo_nodes_cpp_native-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

