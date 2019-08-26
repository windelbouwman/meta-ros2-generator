
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples for composing multiple nodes in a single process."
SECTION = "devel"

ROS_BUILD_DEPENDS = "example-interfaces rclcpp rclcpp-components rcutils std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces launch-ros rclcpp rclcpp-components rcutils std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing launch-testing-ament-cmake launch-testing-ros rmw-implementation-cmake"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/composition/0.7.8-1.zip;downloadfilename=composition_0.7.8-1.zip"
SRC_URI[md5sum] = "01b22e4eeef777a3780f86c0857538ed"
SRC_URI[sha256sum] = "73a2b8dbdec16e436239086745a70ee3c32ab7c7e3bbff06a74e14e19dfd1af7"

S = "${WORKDIR}/demos-release-release-dashing-composition-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

