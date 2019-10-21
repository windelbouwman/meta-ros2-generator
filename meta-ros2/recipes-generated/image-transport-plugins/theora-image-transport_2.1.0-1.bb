
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Theora_image_transport provides a plugin to image_transport for transparently sending an image stream encoded with the Theora codec. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces cv-bridge image-transport libogg libtheora pluginlib rclcpp std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "cv-bridge image-transport libogg libtheora pluginlib rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces cv-bridge image-transport libogg libtheora pluginlib rclcpp rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/dashing/theora_image_transport/2.1.0-1.zip;downloadfilename=theora-image-transport_2.1.0-1.zip"
SRC_URI[md5sum] = "94c285cb7bc2c525b53a7267b5e63153"
SRC_URI[sha256sum] = "d675a46871d0ddf335d1b1541008f6bd8b695a72cae2019154654b28d124be82"

S = "${WORKDIR}/image_transport_plugins-release-release-dashing-theora_image_transport-2.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

