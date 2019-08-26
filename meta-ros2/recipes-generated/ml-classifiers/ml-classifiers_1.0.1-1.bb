
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ml_classifiers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen message-generation pluginlib rclcpp roscpp rosidl-default-generators roslib std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native catkin-native ros-environment-native"
ROS_BUILD_EXPORT_DEPENDS = "eigen pluginlib rclcpp roscpp roslib std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "eigen message-runtime pluginlib rclcpp roscpp rosidl-default-runtime roslib std-msgs"
ROS_TEST_DEPENDS = "ament-cmake-copyright ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-lint-cmake ament-cmake-uncrustify ament-cmake-xmllint ament-lint-auto"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/astuff/ml_classifiers-release/archive/release/dashing/ml_classifiers/1.0.1-1.zip;downloadfilename=ml-classifiers_1.0.1-1.zip"
SRC_URI[md5sum] = "46eb1f8ce0c3e0479d33769187d2cf1e"
SRC_URI[sha256sum] = "33772b09c1c1468c85b7b67bb691cc30df9f07835d9d6dc0afe47ae04ea0b837"

S = "${WORKDIR}/ml_classifiers-release-release-dashing-ml_classifiers-1.0.1-1"

ROS_BUILD_TYPE = "catkin"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

