
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Subscriber node for the aws/monitoring topic to publish metrics to AWS Cloudwatch"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common aws-ros2-common cloudwatch-metrics-common rclcpp rmw-implementation ros-monitoring-msgs std-msgs std-srvs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common aws-ros2-common cloudwatch-metrics-common launch launch-ros rclcpp rmw-implementation ros-monitoring-msgs std-msgs std-srvs"
ROS_TEST_DEPENDS = "ament-cmake-gmock"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/cloudwatch_metrics_collector-release/archive/release/dashing/cloudwatch_metrics_collector/3.0.0-2.zip;downloadfilename=cloudwatch-metrics-collector_3.0.0-2.zip"
SRC_URI[md5sum] = "93f114bfae8009fc19b7ec0406755ee7"
SRC_URI[sha256sum] = "374e34b695cb4260061bedeb7b0f32b7f86f52a844360e65490a9aa35ca28296"

S = "${WORKDIR}/cloudwatch_metrics_collector-release-release-dashing-cloudwatch_metrics_collector-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

