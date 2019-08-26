
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Messages and service definitions common among all ROS actions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rosidl-default-runtime unique-identifier-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/action_msgs/0.7.4-1.zip;downloadfilename=action-msgs_0.7.4-1.zip"
SRC_URI[md5sum] = "cd1fff93d4bd98bc40fb5223bb737211"
SRC_URI[sha256sum] = "9078415e389dadccc237bcccc30b7804160b16162660b25012a2dd84560b16e7"

S = "${WORKDIR}/rcl_interfaces-release-release-dashing-action_msgs-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

