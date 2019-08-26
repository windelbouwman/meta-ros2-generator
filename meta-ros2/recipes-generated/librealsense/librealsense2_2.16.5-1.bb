
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Library for capturing data from the Intel(R) RealSense(TM) SR300 and D400 cameras. This effort was initiated to better support researchers, creative coders, and app developers in domains such as robotics, virtual reality, and the internet of things. Several often-requested features of RealSense(TM); devices are implemented in this project, including multi-camera capture. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "dkms gtk3 libglfw3-dev libssl-dev libusb-1.0-dev linux-headers-generic opengl pkg-config udev"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "dkms gtk3 libglfw3-dev libssl-dev libusb-1.0-dev linux-headers-generic opengl udev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "dkms gtk3 libglfw3-dev libssl-dev libusb-1.0-dev linux-headers-generic opengl udev"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0 & Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=e8978a5103d23266fc6f8ec03dc9eb16"


SRC_URI = "https://github.com/ros2-gbp/librealsense-release/archive/release/dashing/librealsense2/2.16.5-1.zip;downloadfilename=librealsense2_2.16.5-1.zip"
SRC_URI[md5sum] = "629acdb8606ec70d2c93b88dbffab357"
SRC_URI[sha256sum] = "d908b5e568367fd61a3270f1a6a59fc68c04bd11275f40027920ceed5c24ce7c"

S = "${WORKDIR}/librealsense-release-release-dashing-librealsense2-2.16.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

