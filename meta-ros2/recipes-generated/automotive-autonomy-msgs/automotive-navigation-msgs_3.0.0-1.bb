
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generic Messages for Navigation Objectives in Automotive Automation Software"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces geometry-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/astuff/automotive_autonomy_msgs-release/archive/release/dashing/automotive_navigation_msgs/3.0.0-1.zip;downloadfilename=automotive-navigation-msgs_3.0.0-1.zip"
SRC_URI[md5sum] = "2d7cb39a8a17f0012ba698f11380f3bb"
SRC_URI[sha256sum] = "c670cce7eec18b7be1b8409a464f04ccec94505ea06edd522b3e766d3160ec01"

S = "${WORKDIR}/automotive_autonomy_msgs-release-release-dashing-automotive_navigation_msgs-3.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

