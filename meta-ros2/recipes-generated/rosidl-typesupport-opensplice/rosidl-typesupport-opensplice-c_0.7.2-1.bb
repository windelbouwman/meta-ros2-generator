
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the C interfaces for PrismTech OpenSplice."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native libopensplice69-native opensplice-cmake-module-native rosidl-cmake-native rosidl-generator-c-native rosidl-typesupport-opensplice-cpp-native"
ROS_BUILD_EXPORT_DEPENDS = "rmw"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native libopensplice69-native opensplice-cmake-module-native rosidl-cmake-native rosidl-generator-c-native rosidl-generator-dds-idl-native rosidl-typesupport-opensplice-cpp-native"
ROS_EXEC_DEPENDS = "rosidl-parser"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/dashing/rosidl_typesupport_opensplice_c/0.7.2-1.zip;downloadfilename=rosidl-typesupport-opensplice-c_0.7.2-1.zip"
SRC_URI[md5sum] = "ba2053b5773abd86d1518f48f76f27bc"
SRC_URI[sha256sum] = "9255108743b0f416db0c2690f4dc456cc87973f88e733e17352ff82f8b90453a"

S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-dashing-rosidl_typesupport_opensplice_c-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

