
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The teleop_tools_msgs package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/dashing/teleop_tools_msgs/1.0.1-0.zip;downloadfilename=teleop-tools-msgs_1.0.1-0.zip"
SRC_URI[md5sum] = "04d45a587c9d30311910aaeff001d78a"
SRC_URI[sha256sum] = "6e7fe4c2bbdd20ba45598acf23e4d4b3c56bb2aacd1cdaff7bfd29301aaf3d2f"

S = "${WORKDIR}/teleop_tools-release-release-dashing-teleop_tools_msgs-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

