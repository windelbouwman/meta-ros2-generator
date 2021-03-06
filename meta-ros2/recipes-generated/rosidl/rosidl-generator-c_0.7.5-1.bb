
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the ROS interfaces in C."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rosidl-typesupport-interface"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "rosidl-typesupport-interface"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = "rosidl-parser"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common rosidl-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_generator_c/0.7.5-1.zip;downloadfilename=rosidl-generator-c_0.7.5-1.zip"
SRC_URI[md5sum] = "62e1692fe8233ff7cf903a5f8cbe2690"
SRC_URI[sha256sum] = "394f2198784401fdf7839b4cca1e744cf03a47e2c191c04b7e9ebaeac1406dd1"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_generator_c-0.7.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

