
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Contains message and service definitions used by the examples."
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/example_interfaces-release/archive/release/dashing/example_interfaces/0.7.1-1.zip;downloadfilename=example-interfaces_0.7.1-1.zip"
SRC_URI[md5sum] = "5ff0ed22de66c8c0d8d7bc7f88d3bd23"
SRC_URI[sha256sum] = "9affc88d782c46a85583aafbd594edb85a898977c3e9df82db2fadcb524b9f5d"

S = "${WORKDIR}/example_interfaces-release-release-dashing-example_interfaces-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

