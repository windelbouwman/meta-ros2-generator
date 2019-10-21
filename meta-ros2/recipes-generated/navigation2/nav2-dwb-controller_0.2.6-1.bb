
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS2 controller (DWB) metapackage "
SECTION = "devel"

ROS_BUILD_DEPENDS = "costmap-queue dwb-controller dwb-core dwb-critics dwb-msgs dwb-plugins nav-2d-msgs nav-2d-utils"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "costmap-queue dwb-controller dwb-core dwb-critics dwb-msgs dwb-plugins nav-2d-msgs nav-2d-utils"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "costmap-queue dwb-controller dwb-core dwb-critics dwb-msgs dwb-plugins nav-2d-msgs nav-2d-utils"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_dwb_controller/0.2.6-1.zip;downloadfilename=nav2-dwb-controller_0.2.6-1.zip"
SRC_URI[md5sum] = "ae77dc62c8c704165d2aa3716ef766ff"
SRC_URI[sha256sum] = "ba73d7c8afc853d6c9f85379c39e8844fc98d3f39ec6851211a105c49fc8319d"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_dwb_controller-0.2.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

