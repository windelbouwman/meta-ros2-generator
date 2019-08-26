
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Display object analytics result in rviz"
SECTION = "devel"

ROS_BUILD_DEPENDS = "cv-bridge geometry-msgs message-filters object-analytics-msgs object-msgs rclcpp sensor-msgs std-msgs visualization-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cv-bridge geometry-msgs message-filters object-analytics-msgs object-msgs rclcpp sensor-msgs std-msgs visualization-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/dashing/object_analytics_rviz/0.5.4-2.zip;downloadfilename=object-analytics-rviz_0.5.4-2.zip"
SRC_URI[md5sum] = "51b4335a14dc13db08f67348f26ea252"
SRC_URI[sha256sum] = "5b9506250ec729db25935efbbced7e9f94bc5ed2048e0f1a89e0005a7ca65b96"

S = "${WORKDIR}/ros2_object_analytics-release-release-dashing-object_analytics_rviz-0.5.4-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

