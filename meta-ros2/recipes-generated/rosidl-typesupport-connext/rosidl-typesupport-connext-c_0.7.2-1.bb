
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the C interfaces for RTI Connext."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native connext-cmake-module-native rosidl-cmake-native rosidl-generator-c-native rosidl-typesupport-connext-cpp-native"
ROS_BUILD_EXPORT_DEPENDS = "rmw"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native connext-cmake-module-native rcutils-native rosidl-cmake-native rosidl-generator-c-native rosidl-generator-dds-idl-native rosidl-typesupport-connext-cpp-native"
ROS_EXEC_DEPENDS = "rosidl-parser"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/dashing/rosidl_typesupport_connext_c/0.7.2-1.zip;downloadfilename=rosidl-typesupport-connext-c_0.7.2-1.zip"
SRC_URI[md5sum] = "b5e312c2a0d24a7ae3ebed8e15f4dd97"
SRC_URI[sha256sum] = "dccc02d1c36248623be9292cd5018bc4c813ed2f84dd0a37a7d219a9cb1d29f6"

S = "${WORKDIR}/rosidl_typesupport_connext-release-release-dashing-rosidl_typesupport_connext_c-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

