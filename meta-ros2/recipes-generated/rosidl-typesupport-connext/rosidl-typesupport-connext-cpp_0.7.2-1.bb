
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the C++ interfaces for RTI Connext."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native connext-cmake-module-native rosidl-cmake-native rosidl-generator-c-native rosidl-generator-cpp-native rti-connext-dds-5.3.1-native"
ROS_BUILD_EXPORT_DEPENDS = "rmw"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native connext-cmake-module-native rcutils-native rosidl-cmake-native rosidl-generator-c-native rosidl-generator-cpp-native rosidl-generator-dds-idl-native rti-connext-dds-5.3.1-native"
ROS_EXEC_DEPENDS = "rosidl-parser rosidl-typesupport-interface"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/dashing/rosidl_typesupport_connext_cpp/0.7.2-1.zip;downloadfilename=rosidl-typesupport-connext-cpp_0.7.2-1.zip"
SRC_URI[md5sum] = "e001b856480174a5a65e08a85c731c63"
SRC_URI[sha256sum] = "dca98e227813df33aac9f3b5991055be8a17e03f606aa8d4de75e0a9901f8e79"

S = "${WORKDIR}/rosidl_typesupport_connext-release-release-dashing-rosidl_typesupport_connext_cpp-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

