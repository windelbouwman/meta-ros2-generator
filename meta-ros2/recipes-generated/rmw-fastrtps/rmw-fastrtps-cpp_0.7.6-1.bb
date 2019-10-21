
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Implement the ROS middleware interface using eProsima FastRTPS static code generation in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "fastcdr fastrtps fastrtps-cmake-module rcutils rmw rmw-fastrtps-shared-cpp rosidl-generator-c rosidl-generator-cpp rosidl-typesupport-fastrtps-c rosidl-typesupport-fastrtps-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native fastrtps-cmake-module-native rosidl-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "fastcdr fastrtps fastrtps-cmake-module rcutils rmw rmw-fastrtps-shared-cpp rosidl-generator-c rosidl-generator-cpp rosidl-typesupport-fastrtps-c rosidl-typesupport-fastrtps-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = "rcutils rmw rmw-fastrtps-shared-cpp"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/dashing/rmw_fastrtps_cpp/0.7.6-1.zip;downloadfilename=rmw-fastrtps-cpp_0.7.6-1.zip"
SRC_URI[md5sum] = "3410922a84b3e828403e740ebb9f4b48"
SRC_URI[sha256sum] = "ea131c3fbde408feb761a2278d417c061554664135005cdbe515c479ac508af5"

S = "${WORKDIR}/rmw_fastrtps-release-release-dashing-rmw_fastrtps_cpp-0.7.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

