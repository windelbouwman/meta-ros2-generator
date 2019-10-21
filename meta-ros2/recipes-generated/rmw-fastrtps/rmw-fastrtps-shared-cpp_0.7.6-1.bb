
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Code shared on static and dynamic type support of rmw_fastrtps_cpp."
SECTION = "devel"

ROS_BUILD_DEPENDS = "fastcdr fastrtps fastrtps-cmake-module rcpputils rcutils rmw"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native fastrtps-cmake-module-native"
ROS_BUILD_EXPORT_DEPENDS = "fastcdr fastrtps fastrtps-cmake-module rcpputils rcutils rmw"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/dashing/rmw_fastrtps_shared_cpp/0.7.6-1.zip;downloadfilename=rmw-fastrtps-shared-cpp_0.7.6-1.zip"
SRC_URI[md5sum] = "4e09a26c4720cec18e7f194a7d6a8be5"
SRC_URI[sha256sum] = "a316308815d9a7b7307209c2412c3373b7ad27d67229bf1393e7ac783796452e"

S = "${WORKDIR}/rmw_fastrtps-release-release-dashing-rmw_fastrtps_shared_cpp-0.7.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

