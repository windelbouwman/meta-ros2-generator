
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/lifecycle/0.7.8-1.zip;downloadfilename=lifecycle_0.7.8-1.zip"
SRC_URI[md5sum] = "f4ac46b89e5929473dd6a478a45fd8a2"
SRC_URI[sha256sum] = "114e38a627a765c6691ade888bf3a20afe4432e1a95d52a3303c32fb6a2767d7"

S = "${WORKDIR}/demos-release-release-dashing-lifecycle-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

