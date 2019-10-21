
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  marti_perception_msgs  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "sensor-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime sensor-msgs std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_perception_msgs/1.0.0-1.zip;downloadfilename=marti-perception-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "80236020b3b68396812ca16ceffc3585"
SRC_URI[sha256sum] = "d19d9d8ccd67c627d972c024a955e03a3568d37a43a0f57335b9a2f62e729c10"

S = "${WORKDIR}/marti_messages-release-release-dashing-marti_perception_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

