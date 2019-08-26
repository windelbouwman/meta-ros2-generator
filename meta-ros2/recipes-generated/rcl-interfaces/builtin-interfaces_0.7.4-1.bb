
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing message and service definitions for types defined in the OMG IDL Platform Specific Model."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/builtin_interfaces/0.7.4-1.zip;downloadfilename=builtin-interfaces_0.7.4-1.zip"
SRC_URI[md5sum] = "7bf230ee3456b4445498760a2482c728"
SRC_URI[sha256sum] = "031da5fed3cc1c4dfde139d3314e5cd3c79c86a2d483e4141c347f12034a4b7f"

S = "${WORKDIR}/rcl_interfaces-release-release-dashing-builtin_interfaces-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

