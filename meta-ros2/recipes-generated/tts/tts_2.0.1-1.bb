
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package enabling a robot to speak with a human voice by providing a Text-To-Speech ROS service"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gstreamer1.0 gstreamer1.0-alsa gstreamer1.0-plugins-good launch launch-ros python-gst-1.0 python3-boto3 rclpy std-msgs tts-interfaces"
ROS_TEST_DEPENDS = "ament-pep257 launch launch-testing python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/aws-gbp/tts-release/archive/release/dashing/tts/2.0.1-1.zip;downloadfilename=tts_2.0.1-1.zip"
SRC_URI[md5sum] = "9761c288411522f02625de1c4123fd11"
SRC_URI[sha256sum] = "aa4fca9d9e6a3cf86f70b21ed1a8cc67a69b89864f42ea5c5b1509c00d4078fa"

S = "${WORKDIR}/tts-release-release-dashing-tts-2.0.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

