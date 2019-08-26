
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Contains the ROS middleware API."
SECTION = "devel"

ROS_BUILD_DEPENDS = "rcutils"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "rcutils rosidl-generator-c"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw-release/archive/release/dashing/rmw/0.7.2-1.zip;downloadfilename=rmw_0.7.2-1.zip"
SRC_URI[md5sum] = "3c34a8e8a4ca4d44b35ebc5006757d7b"
SRC_URI[sha256sum] = "3fd872ef239169c6610ecd3d6719cea578af24b23cb9af0275e6c48a728aa05d"

S = "${WORKDIR}/rmw-release-release-dashing-rmw-0.7.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

