
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A configuration package defining the runtime for the ROS interfaces."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rosidl-generator-cpp rosidl-generator-py rosidl-typesupport-c rosidl-typesupport-cpp rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/dashing/rosidl_default_runtime/0.7.0-1.zip;downloadfilename=rosidl-default-runtime_0.7.0-1.zip"
SRC_URI[md5sum] = "bffe04e24b604f2edc7b05d8abf63fa3"
SRC_URI[sha256sum] = "5a80875eae2cb8460ec4dcfe9122df7e626b7d02d1483a4ece99aad16a99adb6"

S = "${WORKDIR}/rosidl_defaults-release-release-dashing-rosidl_default_runtime-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

