
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "CloudWatch Logger node for publishing logs to AWS CloudWatch Logs"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common aws-ros2-common cloudwatch-logs-common rcl-interfaces rclcpp std-srvs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common aws-ros2-common cloudwatch-logs-common rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common aws-ros2-common cloudwatch-logs-common launch launch-ros rclcpp std-srvs"
ROS_TEST_DEPENDS = "ament-cmake-gmock"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/cloudwatch_logger-release/archive/release/dashing/cloudwatch_logger/3.0.0-2.zip;downloadfilename=cloudwatch-logger_3.0.0-2.zip"
SRC_URI[md5sum] = "5588c6daf0d3ae1b00e9e9aad2236273"
SRC_URI[sha256sum] = "19eb458c0749e096b54bc6f1f94d36933d882f23d3e0aba05f83a2ac25187fe0"

S = "${WORKDIR}/cloudwatch_logger-release-release-dashing-cloudwatch_logger-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

