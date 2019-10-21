
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


LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d94c5c8f30151b2fe7d07ba53ed6444b"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_amcl/0.2.6-1.zip;downloadfilename=nav2-amcl_0.2.6-1.zip"
SRC_URI[md5sum] = "734f9007ec5168300879b85b317b4b93"
SRC_URI[sha256sum] = "9339e3a3dc5522782eda7f1bd41f18d5207199d896b0e2dc0a14bbe50e235e37"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_amcl-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

