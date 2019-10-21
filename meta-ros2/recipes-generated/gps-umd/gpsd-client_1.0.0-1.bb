
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "connects to a GPSd server and broadcasts GPS fixes using the NavSatFix message"
SECTION = "devel"

ROS_BUILD_DEPENDS = "gps-msgs libgps pkg-config rclcpp rclcpp-components sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "gps-msgs libgps pkg-config rclcpp rclcpp-components sensor-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gps-msgs libgps pkg-config rclcpp rclcpp-components sensor-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/dashing/gpsd_client/1.0.0-1.zip;downloadfilename=gpsd-client_1.0.0-1.zip"
SRC_URI[md5sum] = "18148e613e85996f8f149370b6deaee2"
SRC_URI[sha256sum] = "29a25fbe1382bc837f37b33708f30e48cb1bc9c10d17c868a9b556d9628cc8f2"

S = "${WORKDIR}/gps_umd-release-release-dashing-gpsd_client-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

