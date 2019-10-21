
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "  marti_nav_msgs  "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geographic-msgs geometry-msgs marti-common-msgs sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces geographic-msgs geometry-msgs marti-common-msgs sensor-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geographic-msgs geometry-msgs marti-common-msgs rosidl-default-runtime sensor-msgs std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_nav_msgs/1.0.0-1.zip;downloadfilename=marti-nav-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "3ef05357b7f61c89ebc029bbf590a400"
SRC_URI[sha256sum] = "79b68c1137cbb983e930f40115750872b81360d091adcf6f14429aaec6f263cb"

S = "${WORKDIR}/marti_messages-release-release-dashing-marti_nav_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

