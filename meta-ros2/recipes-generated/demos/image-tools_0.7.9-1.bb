
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Tools to capture and play back images to and from DDS subscriptions and publications."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libopencv-dev rclcpp sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libopencv-dev rclcpp sensor-msgs std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake launch-testing-ros rmw-implementation-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/image_tools/0.7.9-1.zip;downloadfilename=image-tools_0.7.9-1.zip"
SRC_URI[md5sum] = "b75360b051580e361feed58275f7524e"
SRC_URI[sha256sum] = "cd74cfec7bf94d5fe4297e6e5f1242d8666bb6851a71f737be065cfa98ae12c9"

S = "${WORKDIR}/demos-release-release-dashing-image_tools-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

