
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing tools for monitoring ROS 2 topics."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclpy"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch launch-ros rclpy std-msgs"
ROS_TEST_DEPENDS = "ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/topic_monitor/0.7.9-1.zip;downloadfilename=topic-monitor_0.7.9-1.zip"
SRC_URI[md5sum] = "8069a06180801eeac694261f21c73ab2"
SRC_URI[sha256sum] = "8015b4a3a6721f27b21ad5814b5d6901688130f062bbe24c5a4fefdb53056067"

S = "${WORKDIR}/demos-release-release-dashing-topic_monitor-0.7.9-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

