
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Compressed_image_transport provides a plugin to image_transport for transparently sending images encoded as JPEG or PNG. "
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


SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/dashing/compressed_image_transport/2.1.0-1.zip;downloadfilename=compressed-image-transport_2.1.0-1.zip"
SRC_URI[md5sum] = "840500e026f975e4465bf81e830d1c40"
SRC_URI[sha256sum] = "77c0792591dc2b978c30f25bbad78bfb65633fe11f9cdfd3f4b13a91eca0d8ee"

S = "${WORKDIR}/image_transport_plugins-release-release-dashing-compressed_image_transport-2.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

