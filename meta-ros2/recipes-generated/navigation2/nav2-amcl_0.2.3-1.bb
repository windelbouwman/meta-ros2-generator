
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " "
SECTION = "devel"

ROS_BUILD_DEPENDS = "geometry-msgs launch-ros launch-testing message-filters nav-msgs nav2-common nav2-util rclcpp sensor-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "geometry-msgs launch-ros launch-testing message-filters nav-msgs nav2-util rclcpp sensor-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "geometry-msgs launch-ros launch-testing message-filters nav-msgs nav2-util rclcpp sensor-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=46ee8693f40a89a31023e97ae17ecf19"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_amcl/0.2.3-1.zip;downloadfilename=nav2-amcl_0.2.3-1.zip"
SRC_URI[md5sum] = "f8cd3e255e6577a02c68167a12185f36"
SRC_URI[sha256sum] = "c08540beec17988f1107a32c02c7756ea1b276aab43c33adb0b6d2b4eece296c"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_amcl-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

