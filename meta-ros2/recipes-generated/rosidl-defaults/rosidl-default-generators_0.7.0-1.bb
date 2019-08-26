
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A configuration package defining the default ROS interface generators."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native rosidl-cmake-native rosidl-generator-c-native rosidl-generator-cpp-native rosidl-generator-py-native rosidl-typesupport-c-native rosidl-typesupport-cpp-native rosidl-typesupport-introspection-c-native rosidl-typesupport-introspection-cpp-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/dashing/rosidl_default_generators/0.7.0-1.zip;downloadfilename=rosidl-default-generators_0.7.0-1.zip"
SRC_URI[md5sum] = "5a204d18f3b52be242255196fbfc5f3a"
SRC_URI[sha256sum] = "c49c7820256563f435f427b35c6c3c873c63252fb63028374c146a4ec40abca1"

S = "${WORKDIR}/rosidl_defaults-release-release-dashing-rosidl_default_generators-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

