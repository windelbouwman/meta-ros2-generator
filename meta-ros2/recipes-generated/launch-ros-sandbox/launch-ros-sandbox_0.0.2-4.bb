
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Extension to launch_ros to provide the ability to run nodes in sandboxed environments."
SECTION = "devel"

ROS_BUILD_DEPENDS = "launch launch-ros python3-docker"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "launch launch-ros python3-docker"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch launch-ros python3-docker"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/aws-gbp/launch_ros_sandbox-release/archive/release/dashing/launch_ros_sandbox/0.0.2-4.zip;downloadfilename=launch-ros-sandbox_0.0.2-4.zip"
SRC_URI[md5sum] = "69f1ba31a6e847312857bced34d8f167"
SRC_URI[sha256sum] = "e111add248fb91379b42b52f4b60b97ce363cd1a63e456eee743e470d27ca11b"

S = "${WORKDIR}/launch_ros_sandbox-release-release-dashing-launch_ros_sandbox-0.0.2-4"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

