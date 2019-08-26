
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provide CMake module to find RTI Connext."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rti-connext-dds-5.3.1"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/dashing/connext_cmake_module/0.7.2-1.zip;downloadfilename=connext-cmake-module_0.7.2-1.zip"
SRC_URI[md5sum] = "bc62d7b2ad49a3399dbcf66b7d37b6cd"
SRC_URI[sha256sum] = "5f42514f0940e996c69125867fefe7550da07b18fbf6faa348fcdaa8fd7992f0"

S = "${WORKDIR}/rosidl_typesupport_connext-release-release-dashing-connext_cmake_module-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

