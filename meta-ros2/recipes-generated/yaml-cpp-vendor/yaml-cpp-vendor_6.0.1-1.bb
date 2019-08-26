
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Wrapper around yaml-cpp, it provides a fixed CMake module and an ExternalProject build of it. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"


SRC_URI = "https://github.com/ros2-gbp/yaml_cpp_vendor-release/archive/release/dashing/yaml_cpp_vendor/6.0.1-1.zip;downloadfilename=yaml-cpp-vendor_6.0.1-1.zip"
SRC_URI[md5sum] = "5593d8090289128d0ec829ea9803886c"
SRC_URI[sha256sum] = "4b0f7f8c4aab59fa7ba97dbdd2236cf6eb64239102db71a558da67e6c69d8db8"

S = "${WORKDIR}/yaml_cpp_vendor-release-release-dashing-yaml_cpp_vendor-6.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

