
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Implement the ROS middleware interface using eProsima FastRTPS  static code generation in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "fastcdr fastrtps fastrtps-cmake-module rcpputils rcutils rmw rmw-fastrtps-shared-cpp rosidl-generator-c rosidl-typesupport-fastrtps-c rosidl-typesupport-fastrtps-cpp rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native fastrtps-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "fastcdr fastrtps fastrtps-cmake-module rcpputils rcutils rmw rmw-fastrtps-shared-cpp rosidl-generator-c rosidl-typesupport-fastrtps-c rosidl-typesupport-fastrtps-cpp rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/dashing/rmw_fastrtps_dynamic_cpp/0.7.6-1.zip;downloadfilename=rmw-fastrtps-dynamic-cpp_0.7.6-1.zip"
SRC_URI[md5sum] = "5db25ff5a7796b4c245183cf0d5c5469"
SRC_URI[sha256sum] = "8604e8a1fc01fb039ab952be2039ad32378063486f4a2b7104149b9ef93becf2"

S = "${WORKDIR}/rmw_fastrtps-release-release-dashing-rmw_fastrtps_dynamic_cpp-0.7.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

