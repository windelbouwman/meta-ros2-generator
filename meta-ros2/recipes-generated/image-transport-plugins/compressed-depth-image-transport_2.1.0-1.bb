
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Compressed_depth_image_transport provides a plugin to image_transport for transparently sending depth images (raw, floating-point) using PNG compression. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "cv-bridge image-transport"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "cv-bridge image-transport"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cv-bridge image-transport"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/dashing/compressed_depth_image_transport/2.1.0-1.zip;downloadfilename=compressed-depth-image-transport_2.1.0-1.zip"
SRC_URI[md5sum] = "7fb6a8c9749201b518ea06be1fe0adb8"
SRC_URI[sha256sum] = "8d985fd4af553990f85648a539b54ab549f591eb2aa891b08b175b17c25d9616"

S = "${WORKDIR}/image_transport_plugins-release-release-dashing-compressed_depth_image_transport-2.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

