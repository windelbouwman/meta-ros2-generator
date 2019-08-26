
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " voxel_grid provides an implementation of an efficient 3D voxel grid. The occupancy grid can support 3 different representations for the state of a cell: marked, free, or unknown. Due to the underlying implementation relying on bitwise and and or integer operations, the voxel grid only supports 16 different levels per voxel column. However, this limitation yields raytracing and cell marking performance in the grid comparable to standard 2D structures making it quite fast compared to most 3D structures. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "nav2-common rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-cmake-pytest ament-lint-auto ament-lint-common launch launch-testing"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/dashing/nav2_voxel_grid/0.2.3-1.zip;downloadfilename=nav2-voxel-grid_0.2.3-1.zip"
SRC_URI[md5sum] = "5ba0b49195c7868b077de3d724e0a303"
SRC_URI[sha256sum] = "1c4484ea46504f00ae4f27930480389da96c63bfca846ee17e005d496ee7878d"

S = "${WORKDIR}/navigation2-release-release-dashing-nav2_voxel_grid-0.2.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

