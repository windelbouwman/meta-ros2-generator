
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/dummy_robot_bringup/0.7.9-1.zip;downloadfilename=dummy-robot-bringup_0.7.9-1.zip"
SRC_URI[md5sum] = "c4bb898d7899fdd903c93eee0c052f06"
SRC_URI[sha256sum] = "04c2769e2b2edfb49ac813a79f8f327ed4256bf970312c11af9a2337b51b4833"

S = "${WORKDIR}/demos-release-release-dashing-dummy_robot_bringup-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

