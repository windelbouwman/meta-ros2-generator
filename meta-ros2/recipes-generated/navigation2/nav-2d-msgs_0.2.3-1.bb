
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav_2d_msgs/0.2.3-1.zip;downloadfilename=nav-2d-msgs_0.2.3-1.zip"
SRC_URI[md5sum] = "27b51ca73870f1e4474083f09c9782bb"
SRC_URI[sha256sum] = "cdbccd26100432d7d2f4cd332844afdb2a9493b61f35e0198d975a8688cc8ab2"

S = "${WORKDIR}/navigation2-release-release-dashing-nav_2d_msgs-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

