
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/navigation2/0.2.3-1.zip;downloadfilename=navigation2_0.2.3-1.zip"
SRC_URI[md5sum] = "e40ef96f9c980ef81c430331983ade24"
SRC_URI[sha256sum] = "b70eae104d514970bbf26a8e50876ed2b704ba256123834bde519770cdf2e1bd"

S = "${WORKDIR}/navigation2-release-release-dashing-navigation2-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

