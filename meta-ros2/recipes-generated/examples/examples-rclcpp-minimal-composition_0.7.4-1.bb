
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Minimalist examples of composing nodes in the same process"
SECTION = "devel"

ROS_BUILD_DEPENDS = "rclcpp rclcpp-components std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclcpp rclcpp-components std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/dashing/examples_rclcpp_minimal_composition/0.7.4-1.zip;downloadfilename=examples-rclcpp-minimal-composition_0.7.4-1.zip"
SRC_URI[md5sum] = "98a99b3231d6235194e65715530ca81b"
SRC_URI[sha256sum] = "8611c60449ee6b641dab98edeb43942b5a4e20e8766be27a65fd06babf1926d6"

S = "${WORKDIR}/examples-release-release-dashing-examples_rclcpp_minimal_composition-0.7.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

