
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A minimal service server which adds two numbers"
SECTION = "devel"

ROS_BUILD_DEPENDS = "example-interfaces rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces rclcpp"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_service/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-service_0.7.4-1.zip"
SRC_URI[md5sum] = "3660d79dbdb8a088afced480a54040a7"
SRC_URI[sha256sum] = "99aeb4d8ffdf05d144cad8362d4ca81aa0a29b178e2a9e2be4eb23a2260876db"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_service-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

