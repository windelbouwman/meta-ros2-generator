
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing tools for dynamically loadable components"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp class-loader composition-interfaces rclcpp rcpputils"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp class-loader composition-interfaces rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common launch-testing std-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/dashing/rclcpp_components/0.7.11-1.zip;downloadfilename=rclcpp-components_0.7.11-1.zip"
SRC_URI[md5sum] = "2dcc94e74a9d12bd42b82d9c481cb031"
SRC_URI[sha256sum] = "7c7c8f4d29f978a8e5ffce69cd8d202aa8309b2e9927b80aed7d1ece89430437"

S = "${WORKDIR}/rclcpp-release-release-dashing-rclcpp_components-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

