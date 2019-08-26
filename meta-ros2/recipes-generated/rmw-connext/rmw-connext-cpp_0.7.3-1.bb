
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Implement the ROS middleware interface using RTI Connext static code generation in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "connext-cmake-module rcutils rmw rmw-connext-shared-cpp rosidl-generator-c rosidl-generator-cpp rosidl-generator-dds-idl rosidl-typesupport-connext-c rosidl-typesupport-connext-cpp rti-connext-dds-5.3.1"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "connext-cmake-module rosidl-generator-c rosidl-generator-cpp rosidl-typesupport-connext-c rosidl-typesupport-connext-cpp rti-connext-dds-5.3.1"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native rosidl-cmake-native"
ROS_EXEC_DEPENDS = "rcutils rmw rmw-connext-shared-cpp"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/dashing/rmw_connext_cpp/0.7.3-1.zip;downloadfilename=rmw-connext-cpp_0.7.3-1.zip"
SRC_URI[md5sum] = "68f0a1744eb6725bf1d1d2ef29552bda"
SRC_URI[sha256sum] = "addf01a00e02ffb6979eae2d4a31f2bdd6d9e15bb948e7b24b2cbff4f61b8c3a"

S = "${WORKDIR}/rmw_connext-release-release-dashing-rmw_connext_cpp-0.7.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

