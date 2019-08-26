
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " dummy robot bringup "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python dummy-map-server dummy-sensors launch launch-ros robot-state-publisher ros2run"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/dummy_robot_bringup/0.7.8-1.zip;downloadfilename=dummy-robot-bringup_0.7.8-1.zip"
SRC_URI[md5sum] = "ecafa93fa2ca308913051cd6f53bbdfa"
SRC_URI[sha256sum] = "4da7b43fe7f09cc87c0c0720001247c7f3ba79ec00407d7343991b5b45fc49fd"

S = "${WORKDIR}/demos-release-release-dashing-dummy_robot_bringup-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

