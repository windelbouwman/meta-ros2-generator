
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "AprilTag detection node"
SECTION = "devel"

ROS_BUILD_DEPENDS = "apriltag apriltag-msgs cv-bridge eigen image-transport rclcpp rclcpp-components sensor-msgs tf2-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "apriltag apriltag-msgs cv-bridge image-transport rclcpp rclcpp-components sensor-msgs tf2-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "apriltag apriltag-msgs cv-bridge image-transport rclcpp rclcpp-components sensor-msgs tf2-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/christianrauch/apriltag_ros-release/archive/release/dashing/apriltag_ros/2.1.0-1.zip;downloadfilename=apriltag-ros_2.1.0-1.zip"
SRC_URI[md5sum] = "c08878f055ab902696721a71a7ce5469"
SRC_URI[sha256sum] = "42461485994a4c5b2e6da55a65fa7c4b84246dae53e9959e3dbf41c4807463aa"

S = "${WORKDIR}/apriltag_ros-release-release-dashing-apriltag_ros-2.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

