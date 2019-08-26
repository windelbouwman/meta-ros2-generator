
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " KDL binding for tf2 "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces eigen geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces eigen geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces eigen geometry-msgs orocos-kdl tf2 tf2-ros"
ROS_TEST_DEPENDS = "ament-cmake-gtest rclcpp tf2-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/dashing/tf2_kdl/0.11.4-1.zip;downloadfilename=tf2-kdl_0.11.4-1.zip"
SRC_URI[md5sum] = "95b0a838a28c0d387d3516e2d821ca75"
SRC_URI[sha256sum] = "7bce7d710a646969d760f433463a0dcae3269d74cb0d0dfee445185243ed4578"

S = "${WORKDIR}/geometry2-release-release-dashing-tf2_kdl-0.11.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

