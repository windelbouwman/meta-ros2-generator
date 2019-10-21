
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROS specific extensions to the launch tool."
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-python composition-interfaces launch lifecycle-msgs osrf-pycommon python3-yaml rclpy"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ament-index-python composition-interfaces launch lifecycle-msgs osrf-pycommon python3-yaml rclpy"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python composition-interfaces launch lifecycle-msgs osrf-pycommon python3-yaml rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/launch_ros-release/archive/release/dashing/launch_ros/0.8.7-1.zip;downloadfilename=launch-ros_0.8.7-1.zip"
SRC_URI[md5sum] = "fe1796a46ace64ada23b39113042a09b"
SRC_URI[sha256sum] = "44402b29f1733449b6ccbd525e67ece552cb235d409304be0928c2eaecebbbc8"

S = "${WORKDIR}/launch_ros-release-release-dashing-launch_ros-0.8.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

