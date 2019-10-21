
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS package for LDS(HLS-LFCD2). The LDS (Laser Distance Sensor) is a sensor sending the data to Host for the simultaneous localization and mapping (SLAM). Simultaneously the detecting obstacle data can also be sent to Host. HLDS(Hitachi-LG Data Storage) is developing the technology for the moving platform sensor such as Robot Vacuum Cleaners, Home Robot, Robotics Lawn Mower Sensor, etc. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "libboost-system-dev rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libboost-system-dev rclcpp sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libboost-system-dev rclcpp sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/robotis-ros2-release/hls_lfcd_lds_driver-release/archive/release/dashing/hls_lfcd_lds_driver/2.0.0-1.zip;downloadfilename=hls-lfcd-lds-driver_2.0.0-1.zip"
SRC_URI[md5sum] = "7da71760c12b8a9642e7936e17d9d86b"
SRC_URI[sha256sum] = "81840117b55f69ea11dd1a6291be0bc160db98ca79c6a524b6eb02ce4b07375b"

S = "${WORKDIR}/hls_lfcd_lds_driver-release-release-dashing-hls_lfcd_lds_driver-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

