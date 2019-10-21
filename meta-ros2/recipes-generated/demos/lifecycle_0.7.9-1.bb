
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing demos for lifecycle implementation"
SECTION = "devel"

ROS_BUILD_DEPENDS = "lifecycle-msgs rclcpp-lifecycle std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "lifecycle-msgs rclcpp-lifecycle ros2run std-msgs"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common ros-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/lifecycle/0.7.9-1.zip;downloadfilename=lifecycle_0.7.9-1.zip"
SRC_URI[md5sum] = "83c35525819044d1369f422eea1fe967"
SRC_URI[sha256sum] = "f2d4d2f1b0219ac842be3720f2a9e50ae2192220dd59f8a13b8e0cf4c4cc6520"

S = "${WORKDIR}/demos-release-release-dashing-lifecycle-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

