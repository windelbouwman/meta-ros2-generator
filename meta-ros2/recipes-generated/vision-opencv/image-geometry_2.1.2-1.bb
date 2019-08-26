
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " `image_geometry` contains C++ and Python libraries for interpreting images geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo messages with OpenCV functions such as image rectification, much as cv_bridge interfaces ROS sensor_msgs/Image with OpenCV data types. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "libopencv-dev sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-python-native ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "libopencv-dev sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libopencv-dev sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/dashing/image_geometry/2.1.2-1.zip;downloadfilename=image-geometry_2.1.2-1.zip"
SRC_URI[md5sum] = "7675d19c4025df41e1fba4fa41e1a43b"
SRC_URI[sha256sum] = "02ae8fc293784aa72c845764c03da7d00fc66cb222a93e1898d42610c2c4fde4"

S = "${WORKDIR}/vision_opencv-release-release-dashing-image_geometry-2.1.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

