
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Implement the ROS middleware interface using PrismTech OpenSplice static code generation in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libopensplice69 rcpputils rcutils rmw rosidl-generator-c rosidl-generator-cpp rosidl-generator-dds-idl rosidl-typesupport-opensplice-c rosidl-typesupport-opensplice-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native opensplice-cmake-module-native rosidl-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libopensplice69 rosidl-generator-c rosidl-generator-cpp rosidl-typesupport-opensplice-c rosidl-typesupport-opensplice-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native opensplice-cmake-module-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = "rmw"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_opensplice-release/archive/release/dashing/rmw_opensplice_cpp/0.7.3-1.zip;downloadfilename=rmw-opensplice-cpp_0.7.3-1.zip"
SRC_URI[md5sum] = "5cd9ccec1a74566d944ecc3fc56e1dfb"
SRC_URI[sha256sum] = "b27cfb9688ed762a15890a9f0874f9e4f4f39dd19ff053e27dbd0fa675debac7"

S = "${WORKDIR}/rmw_opensplice-release-release-dashing-rmw_opensplice_cpp-0.7.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

