
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the ROS interfaces in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rosidl-generator-c"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = "rosidl-parser"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common rosidl-cmake rosidl-generator-c"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_generator_cpp/0.7.5-1.zip;downloadfilename=rosidl-generator-cpp_0.7.5-1.zip"
SRC_URI[md5sum] = "ae0f2eb44933b27a0e462e019efda4a4"
SRC_URI[sha256sum] = "79e2f2889f894948d99774ab643d4786e955eb1f693820fdf4dfa9b72184cb46"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_generator_cpp-0.7.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

