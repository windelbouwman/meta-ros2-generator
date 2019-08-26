
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal publisher nodes"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_publisher/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-publisher_0.7.4-1.zip"
SRC_URI[md5sum] = "07f6980aa7a4dac141d0a46683175e8d"
SRC_URI[sha256sum] = "9cf61775be9e95b4c29a3deffd7b240099b9544f8fef43ace8abde7b99f19306"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_publisher-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

