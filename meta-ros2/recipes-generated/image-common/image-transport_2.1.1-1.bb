
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  image_transport should always be used to subscribe to and publish images. It provides transparent support for transporting images in low-bandwidth compressed formats. Examples (provided by separate plugin packages) include JPEG/PNG compression and Theora streaming video.  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "message-filters pluginlib rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "message-filters pluginlib rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "message-filters pluginlib rclcpp sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/image_common-release/archive/release/dashing/image_transport/2.1.1-1.zip;downloadfilename=image-transport_2.1.1-1.zip"
SRC_URI[md5sum] = "ee3834ac7c6765f72cfcdfec5fc83621"
SRC_URI[sha256sum] = "1030c2ea55efa8b1ef60747456737842533526531117b570b24e4dfdba522fe9"

S = "${WORKDIR}/image_common-release-release-dashing-image_transport-2.1.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

