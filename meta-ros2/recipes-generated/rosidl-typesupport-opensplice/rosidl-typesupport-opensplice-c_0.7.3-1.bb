
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


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/dashing/rosidl_typesupport_opensplice_c/0.7.3-1.zip;downloadfilename=rosidl-typesupport-opensplice-c_0.7.3-1.zip"
SRC_URI[md5sum] = "c22260aeb0e1519354c70c5d23874de5"
SRC_URI[sha256sum] = "6bf5754effdfcb289bbe1c4032cdfd7714b5a88f3ad3d865bb7149bbe1d7cce3"

S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-dashing-rosidl_typesupport_opensplice_c-0.7.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

