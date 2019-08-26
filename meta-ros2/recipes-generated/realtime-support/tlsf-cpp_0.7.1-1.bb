
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "C++ stdlib-compatible wrapper around tlsf allocator and ROS2 examples"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake rclcpp rmw std-msgs tlsf"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake rclcpp rmw std-msgs tlsf"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common rmw-implementation-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"


SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/dashing/tlsf_cpp/0.7.1-1.zip;downloadfilename=tlsf-cpp_0.7.1-1.zip"
SRC_URI[md5sum] = "b1289809fad251fbee6a44922dd43eaa"
SRC_URI[sha256sum] = "44878ce5c8bddcb7e3cb547214ef00f48c5ba6ec697c33adce7eafd742995006"

S = "${WORKDIR}/realtime_support-release-release-dashing-tlsf_cpp-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

