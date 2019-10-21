
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " A set of plugins for publishing and subscribing to sensor_msgs/Image topics in representations other than raw pixel data. For example, for viewing a stream of images off-robot, a video codec will give much lower bandwidth and latency. For low frame rate tranport of high-definition images, you might prefer sending them as JPEG or PNG-compressed form. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "compressed-depth-image-transport compressed-image-transport theora-image-transport"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/dashing/image_transport_plugins/2.1.0-1.zip;downloadfilename=image-transport-plugins_2.1.0-1.zip"
SRC_URI[md5sum] = "2a0c5fd3c71197f8154dbf75637135a6"
SRC_URI[sha256sum] = "b61dbf89eb90f66b8aa9843ade91a052f5df156cba6e31620637f7fcd3b9a677"

S = "${WORKDIR}/image_transport_plugins-release-release-dashing-image_transport_plugins-2.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

