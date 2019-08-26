
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Examples of minimal service clients"
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


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_client/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-client_0.7.4-1.zip"
SRC_URI[md5sum] = "fa3eaf9cbbf373a5cf6485d0aeafcb48"
SRC_URI[sha256sum] = "602acc83c7101e60a06c0027d87b29ef4ae8b3f8710304512143785845f14b0a"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_client-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

