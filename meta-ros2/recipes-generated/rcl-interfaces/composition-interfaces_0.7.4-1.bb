
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing message and service definitions for managing composable nodes in a container process."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcl-interfaces"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "rcl-interfaces"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rcl-interfaces rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/composition_interfaces/0.7.4-1.zip;downloadfilename=composition-interfaces_0.7.4-1.zip"
SRC_URI[md5sum] = "2f301a145cf5a14f67dc03432848f3b3"
SRC_URI[sha256sum] = "3108fcef0da033f16923a0cb8f7817c914836fa32c92a7d1943b11b62fdb55aa"

S = "${WORKDIR}/rcl_interfaces-release-release-dashing-composition_interfaces-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

