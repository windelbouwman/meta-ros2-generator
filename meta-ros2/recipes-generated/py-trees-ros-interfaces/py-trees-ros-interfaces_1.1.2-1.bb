
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Interfaces used by py_trees_ros and py_trees_ros_tutorials. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "action-msgs geometry-msgs rosidl-default-generators unique-identifier-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "action-msgs geometry-msgs unique-identifier-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "action-msgs geometry-msgs rosidl-default-runtime unique-identifier-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_ros_interfaces-release/archive/release/dashing/py_trees_ros_interfaces/1.1.2-1.zip;downloadfilename=py-trees-ros-interfaces_1.1.2-1.zip"
SRC_URI[md5sum] = "a07887ba49e708b89a0e95acc4997667"
SRC_URI[sha256sum] = "bf0b192b21352a6da51af94358dd00e1019f462d59e7544c676924b4903f4671"

S = "${WORKDIR}/py_trees_ros_interfaces-release-release-dashing-py_trees_ros_interfaces-1.1.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

