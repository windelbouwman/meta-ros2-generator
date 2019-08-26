
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " dummy map server node "
SECTION = "devel"

ROS_BUILD_DEPENDS = "nav-msgs rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "nav-msgs rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/dummy_map_server/0.7.8-1.zip;downloadfilename=dummy-map-server_0.7.8-1.zip"
SRC_URI[md5sum] = "d9795a616e99a5fb63b761f9f95a01de"
SRC_URI[sha256sum] = "53d622e84690d1279077b8871b665a0b1b8472fa9a78960740c7e137d0d776c4"

S = "${WORKDIR}/demos-release-release-dashing-dummy_map_server-0.7.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

