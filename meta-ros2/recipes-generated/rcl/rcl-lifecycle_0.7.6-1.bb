
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing a C-based lifecycle implementation"
SECTION = "devel"

ROS_BUILD_DEPENDS = "lifecycle-msgs rcl rcutils rmw-implementation rosidl-generator-c"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "lifecycle-msgs rcl rcutils rmw-implementation rosidl-generator-c"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common osrf-testing-tools-cpp"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/dashing/rcl_lifecycle/0.7.6-1.zip;downloadfilename=rcl-lifecycle_0.7.6-1.zip"
SRC_URI[md5sum] = "4c957bf57d04588506e6c20ed0144f50"
SRC_URI[sha256sum] = "d96b34b77ea8cf655e3aceef58776b4ab739ae4fe48d5b484b1dacc4d4bd4bc4"

S = "${WORKDIR}/rcl-release-release-dashing-rcl_lifecycle-0.7.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

