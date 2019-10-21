
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides service calls for getting ros meta-information, like list of topics, services, params, etc. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces rcl-interfaces rclpy ros2node ros2param ros2pkg ros2service ros2topic rosbridge-library rosidl-default-runtime"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rosbridge_suite-release/archive/release/dashing/rosapi/1.0.2-1.zip;downloadfilename=rosapi_1.0.2-1.zip"
SRC_URI[md5sum] = "ebf0d2a67c3273ff75d489bf5714daa0"
SRC_URI[sha256sum] = "358155c3f54ebf3868b51c3d1be28e701225a9ec4e0436c5130325090019ab6f"

S = "${WORKDIR}/rosbridge_suite-release-release-dashing-rosapi-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

