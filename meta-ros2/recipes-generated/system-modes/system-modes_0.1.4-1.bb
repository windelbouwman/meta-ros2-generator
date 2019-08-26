
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Model-based distributed configuration handling."
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces libboost-program-options-dev rclcpp rclcpp-lifecycle rosidl-default-generators std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces libboost-program-options-dev rclcpp rclcpp-lifecycle rosidl-default-generators std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces libboost-program-options-dev rclcpp rclcpp-lifecycle rosidl-default-generators std-msgs"
ROS_TEST_DEPENDS = "ament-cmake ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-flake8 ament-cmake-gmock ament-cmake-gtest ament-cmake-pep257 ament-cmake-uncrustify ament-lint-auto"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/microROS/system_modes-release/archive/release/dashing/system_modes/0.1.4-1.zip;downloadfilename=system-modes_0.1.4-1.zip"
SRC_URI[md5sum] = "e95e742958a22c77e58631fd972bafb0"
SRC_URI[sha256sum] = "b279d0e18ba2cbc1fbce9527ea1172776eb45d9bfc4f8f4e5ca715ebd8845020"

S = "${WORKDIR}/system_modes-release-release-dashing-system_modes-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

