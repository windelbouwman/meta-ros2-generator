
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The object_analytics_node package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "class-loader cv-bridge geometry-msgs libpcl-all-dev lz4 message-filters object-analytics-msgs object-msgs pcl-conversions rclcpp rclcpp-components rclcpp-components sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python class-loader cv-bridge geometry-msgs libpcl-all libpcl-all-dev lz4 message-filters object-analytics-msgs object-msgs pcl-conversions rclcpp sensor-msgs std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"


SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/dashing/object_analytics_node/0.5.4-2.zip;downloadfilename=object-analytics-node_0.5.4-2.zip"
SRC_URI[md5sum] = "f6090c6dfad4101483550a8a820490b2"
SRC_URI[sha256sum] = "6c72052412f1982e91f025a17a94fb7296e7558e6321d0af763f861b121e1d21"

S = "${WORKDIR}/ros2_object_analytics-release-release-dashing-object_analytics_node-0.5.4-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

