
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Interfaces used by py_trees_ros and py_trees_ros_tutorials. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs diagnostic-msgs geometry-msgs rosidl-default-generators unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs diagnostic-msgs geometry-msgs unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs diagnostic-msgs geometry-msgs rosidl-default-runtime unique-identifier-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_ros_interfaces-release/archive/release/dashing/py_trees_ros_interfaces/1.2.0-1.zip;downloadfilename=py-trees-ros-interfaces_1.2.0-1.zip"
SRC_URI[md5sum] = "4e11144932167ec8d6546781ada6dc89"
SRC_URI[sha256sum] = "38744629285d4874a8e4f1ace250a9aaa3fa731a55d419d5bbbe53086e20a7fe"

S = "${WORKDIR}/py_trees_ros_interfaces-release-release-dashing-py_trees_ros_interfaces-1.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

