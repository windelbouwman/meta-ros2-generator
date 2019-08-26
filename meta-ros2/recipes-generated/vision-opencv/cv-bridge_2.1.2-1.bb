
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This contains CvBridge, which converts between ROS2 Image messages and OpenCV images. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost libopencv-dev python3-numpy sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native python-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "boost libopencv-dev python3-numpy sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python boost libopencv-dev python3-numpy sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common python3-opencv"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/dashing/cv_bridge/2.1.2-1.zip;downloadfilename=cv-bridge_2.1.2-1.zip"
SRC_URI[md5sum] = "9d9c8bd6b4b759d5db2f493d27995737"
SRC_URI[sha256sum] = "ae0313afa05e3421a1896d2bd99b11a7d15287a15dd1c14f29c98015be79c036"

S = "${WORKDIR}/vision_opencv-release-release-dashing-cv_bridge-2.1.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

