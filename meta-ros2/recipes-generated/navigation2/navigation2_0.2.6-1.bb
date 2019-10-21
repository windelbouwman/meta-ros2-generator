
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS2 Navigation Stack "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "nav2-amcl nav2-behavior-tree nav2-bt-navigator nav2-costmap-2d nav2-dwb-controller nav2-lifecycle-manager nav2-map-server nav2-msgs nav2-navfn-planner nav2-recoveries nav2-rviz-plugins nav2-util nav2-voxel-grid nav2-world-model"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/navigation2/0.2.6-1.zip;downloadfilename=navigation2_0.2.6-1.zip"
SRC_URI[md5sum] = "8dbde835f47c74abbda512077cc67fef"
SRC_URI[sha256sum] = "7727255ffc5ec57f55f1b9e6093ad1fcdc0affd495582ceb3e3bff4a820668f7"

S = "${WORKDIR}/navigation2-release-release-dashing-navigation2-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

