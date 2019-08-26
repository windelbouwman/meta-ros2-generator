
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the DDS interfaces for ROS interfaces."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_dds-release/archive/release/dashing/rosidl_generator_dds_idl/0.7.1-1.zip;downloadfilename=rosidl-generator-dds-idl_0.7.1-1.zip"
SRC_URI[md5sum] = "fd7af8e0423b70f8c75880ac21149122"
SRC_URI[sha256sum] = "a044c4673dc7c8ed1f0258aa4d3375b09acaeb7b1e5f3f2c4fecd01c2caf501f"

S = "${WORKDIR}/rosidl_dds-release-release-dashing-rosidl_generator_dds_idl-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

