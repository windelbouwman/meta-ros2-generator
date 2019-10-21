
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


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_generator_cpp/0.7.7-1.zip;downloadfilename=rosidl-generator-cpp_0.7.7-1.zip"
SRC_URI[md5sum] = "a526ac1130574df077d3fd0484814de8"
SRC_URI[sha256sum] = "52b60772836e2eee07dae8aa2cb962e695a3b32280417dfe4c2e626b8482be3c"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_generator_cpp-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

