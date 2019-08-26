
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


SRC_URI = "https://github.com/ros2-gbp/rclcpp-release/archive/release/dashing/rclcpp_components/0.7.7-1.zip;downloadfilename=rclcpp-components_0.7.7-1.zip"
SRC_URI[md5sum] = "ab015a4e61bd5dcbb1cdba972bd9c6d3"
SRC_URI[sha256sum] = "b60d09b3230fc3c34616d684f8e45f0fbb97d703cec79f3c1d167de262470d66"

S = "${WORKDIR}/rclcpp-release-release-dashing-rclcpp_components-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

