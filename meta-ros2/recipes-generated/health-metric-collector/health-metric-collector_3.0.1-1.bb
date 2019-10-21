
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package providing a ROS node for sending health metrics to Cloudwatch Metrics"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common aws-ros2-common rclcpp ros-monitoring-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common launch launch-ros rclcpp ros-monitoring-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gmock"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/health_metric_collector-release/archive/release/dashing/health_metric_collector/3.0.1-1.zip;downloadfilename=health-metric-collector_3.0.1-1.zip"
SRC_URI[md5sum] = "1a222f0b2d9e617edf7058ad95c5567b"
SRC_URI[sha256sum] = "6edc68626d629edb8dec45e798c638584750c3a6e9f1161a87d0a2af99488e97"

S = "${WORKDIR}/health_metric_collector-release-release-dashing-health_metric_collector-3.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

