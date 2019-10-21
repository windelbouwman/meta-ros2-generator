
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Basic message types for two dimensional navigation, extending from geometry_msgs::Pose2D."
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs rosidl-default-generators std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs rosidl-default-generators std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4633480cdd27d7906aaf3ef4b72014b2"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav_2d_msgs/0.2.6-1.zip;downloadfilename=nav-2d-msgs_0.2.6-1.zip"
SRC_URI[md5sum] = "7401cafd6f2047079d2d169cbaadbbf5"
SRC_URI[sha256sum] = "2c9d28f58e607d4ae6dbf0a1a1894a8755dd75235ff98b418995d13508a4b7db"

S = "${WORKDIR}/navigation2-release-release-dashing-nav_2d_msgs-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

