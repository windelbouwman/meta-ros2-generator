
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Implement the ROS middleware interface using Eclipse CycloneDDS in C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "cyclonedds cyclonedds-cmake-module rcutils rmw rosidl-generator-c rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native cyclonedds-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "cyclonedds cyclonedds-cmake-module rcutils rmw rosidl-generator-c rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_cyclonedds-release/archive/release/dashing/rmw_cyclonedds_cpp/0.4.0-1.zip;downloadfilename=rmw-cyclonedds-cpp_0.4.0-1.zip"
SRC_URI[md5sum] = "d6193965e08dcd555f36077e9f9c8bcb"
SRC_URI[sha256sum] = "f3c8c2cfdd9e1be2038b53374b1733d8a0032b345ef83b1078e910b3d1c24fcb"

S = "${WORKDIR}/rmw_cyclonedds-release-release-dashing-rmw_cyclonedds_cpp-0.4.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

