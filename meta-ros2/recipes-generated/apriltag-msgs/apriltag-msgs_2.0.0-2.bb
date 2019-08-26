
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "AprilTag message definitions"
SECTION = "devel"

ROS_BUILD_DEPENDS = "std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/christianrauch/apriltag_msgs-release/archive/release/dashing/apriltag_msgs/2.0.0-2.zip;downloadfilename=apriltag-msgs_2.0.0-2.zip"
SRC_URI[md5sum] = "202bd039e46bb09fd5e1071bbf1f24cf"
SRC_URI[sha256sum] = "75724f28ac762c0a0ff6d48748786eff2724897f9eae0ee01adf777b80335ff9"

S = "${WORKDIR}/apriltag_msgs-release-release-dashing-apriltag_msgs-2.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

