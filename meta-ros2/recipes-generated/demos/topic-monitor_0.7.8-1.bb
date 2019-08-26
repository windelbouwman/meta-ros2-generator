
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/topic_monitor/0.7.8-1.zip;downloadfilename=topic-monitor_0.7.8-1.zip"
SRC_URI[md5sum] = "dfd5130d391fea36a05021d09e8dc6f9"
SRC_URI[sha256sum] = "2171ae925e5b84f2be37318dfd23f4f3cc82c1499c24c3a97cebc7a15cb8ea90"

S = "${WORKDIR}/demos-release-release-dashing-topic_monitor-0.7.8-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

