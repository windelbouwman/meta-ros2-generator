
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "C++ types and functions shared by the ROS middleware interface to RTI Connext Static and RTI Connext Dynamic."
SECTION = "devel"

ROS_BUILD_DEPENDS = "connext-cmake-module rcutils rmw rti-connext-dds-5.3.1"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "connext-cmake-module rti-connext-dds-5.3.1"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/dashing/rmw_connext_shared_cpp/0.7.3-1.zip;downloadfilename=rmw-connext-shared-cpp_0.7.3-1.zip"
SRC_URI[md5sum] = "8d60b9bade4b46bcb1debc014ab80d9b"
SRC_URI[sha256sum] = "60cdbf64e35693912811a3fde7475518423813da4067ac05bf6266fcdb5598d0"

S = "${WORKDIR}/rmw_connext-release-release-dashing-rmw_connext_shared_cpp-0.7.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

