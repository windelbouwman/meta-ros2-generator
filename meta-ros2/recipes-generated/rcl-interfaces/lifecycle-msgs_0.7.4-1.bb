
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some lifecycle related message and service definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/lifecycle_msgs/0.7.4-1.zip;downloadfilename=lifecycle-msgs_0.7.4-1.zip"
SRC_URI[md5sum] = "c78b385b5dfd24acf562436925a6820d"
SRC_URI[sha256sum] = "330af8641e3dbd990e2a4157bd798da5b938ba048c7b4c6cbfe0e5f011a01d0c"

S = "${WORKDIR}/rcl_interfaces-release-release-dashing-lifecycle_msgs-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

