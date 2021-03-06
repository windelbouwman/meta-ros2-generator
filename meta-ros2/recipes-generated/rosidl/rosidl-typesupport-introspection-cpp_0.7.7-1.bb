
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Generate the message type support for dynamic message construction in C++. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rosidl-typesupport-introspection-c"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = "rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-parser rosidl-typesupport-interface rosidl-typesupport-introspection-c"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_typesupport_introspection_cpp/0.7.7-1.zip;downloadfilename=rosidl-typesupport-introspection-cpp_0.7.7-1.zip"
SRC_URI[md5sum] = "4bf39569e56d40bac2504b402e89ca83"
SRC_URI[sha256sum] = "aad68ac72ed054844fa05594fbdbc2324f2f64e32fa88a02fca6c2cb26b50938"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_typesupport_introspection_cpp-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

