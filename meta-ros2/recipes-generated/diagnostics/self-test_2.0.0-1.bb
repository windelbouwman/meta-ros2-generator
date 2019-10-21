
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "self_test"
SECTION = "devel"

ROS_BUILD_DEPENDS = "diagnostic-msgs diagnostic-updater rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "diagnostic-msgs diagnostic-updater rclcpp"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "diagnostic-msgs diagnostic-updater rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/diagnostics-release/archive/release/dashing/self_test/2.0.0-1.zip;downloadfilename=self-test_2.0.0-1.zip"
SRC_URI[md5sum] = "ffc062fae61c1175d777128420d38bcf"
SRC_URI[sha256sum] = "aaa3cd139feebd3e93394ed5175d9b302ebe7eb5925257c8ac6202996ff30c80"

S = "${WORKDIR}/diagnostics-release-release-dashing-self_test-2.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

