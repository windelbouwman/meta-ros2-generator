
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The decision which ROS middleware implementation should be used for C++."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libpoco-dev poco-vendor rcutils rmw rmw-connext-cpp rmw-fastrtps-cpp rmw-implementation-cmake rmw-opensplice-cpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libpoco-dev poco-vendor rmw-implementation-cmake"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libpoco-dev poco-vendor rmw-implementation-cmake"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_implementation-release/archive/release/dashing/rmw_implementation/0.7.1-2.zip;downloadfilename=rmw-implementation_0.7.1-2.zip"
SRC_URI[md5sum] = "ec4d9496083b790ad6e22aeb09ce99c0"
SRC_URI[sha256sum] = "9f02fe17d9fa960b8786af8bb62facd57ea3b216c127b0608a78a53fdd50d058"

S = "${WORKDIR}/rmw_implementation-release-release-dashing-rmw_implementation-0.7.1-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

