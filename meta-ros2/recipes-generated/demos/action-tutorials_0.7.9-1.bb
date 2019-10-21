
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Action tutorial code examples"
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs rclpy rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/action_tutorials/0.7.9-1.zip;downloadfilename=action-tutorials_0.7.9-1.zip"
SRC_URI[md5sum] = "2f68308f8de5b3c6497d813fe7fb5ad6"
SRC_URI[sha256sum] = "043ab1a57e3e5dc8e59d4c2040f4a66b36da1677cf22ff803e6e13684af37090"

S = "${WORKDIR}/demos-release-release-dashing-action_tutorials-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

