
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " dummy sensor nodes "
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp sensor-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp sensor-msgs"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/dummy_sensors/0.7.9-1.zip;downloadfilename=dummy-sensors_0.7.9-1.zip"
SRC_URI[md5sum] = "4a655d93099981d26d2c0d8c4763849a"
SRC_URI[sha256sum] = "26afd868e9ff6058517c8acad6980c71e2b29258fa23aed79e9a6966dd4cbc61"

S = "${WORKDIR}/demos-release-release-dashing-dummy_sensors-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

