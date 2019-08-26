
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The entry point package to launch testing in ROS."
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake-core ament-cmake-export-dependencies"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "launch-testing launch-testing-ament-cmake launch-testing-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = "launch-testing-ament-cmake-native ros2test-native"
ROS_EXEC_DEPENDS = "launch-testing launch-testing-ros ros2test"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros_testing-release/archive/release/dashing/ros_testing/0.1.0-1.zip;downloadfilename=ros-testing_0.1.0-1.zip"
SRC_URI[md5sum] = "935e41f816708ca76103696731880411"
SRC_URI[sha256sum] = "ec5a446dd4e42d2cbe223a5c7cafbf8f70cca79599c4fd47cf5d9233b55ec92f"

S = "${WORKDIR}/ros_testing-release-release-dashing-ros_testing-0.1.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

