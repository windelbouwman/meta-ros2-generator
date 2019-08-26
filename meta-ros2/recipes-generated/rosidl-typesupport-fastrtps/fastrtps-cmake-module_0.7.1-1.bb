
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provide CMake module to find eProsima FastRTPS."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/dashing/fastrtps_cmake_module/0.7.1-1.zip;downloadfilename=fastrtps-cmake-module_0.7.1-1.zip"
SRC_URI[md5sum] = "a5badd9c943e8d60df5794fc73e98e97"
SRC_URI[sha256sum] = "fc61e91aa21d4e6a751694b475d6a0ab9d16aa50e802c7ac9fa0473ca68f4cf0"

S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-dashing-fastrtps_cmake_module-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

