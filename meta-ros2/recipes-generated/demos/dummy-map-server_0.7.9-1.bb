
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/dummy_map_server/0.7.9-1.zip;downloadfilename=dummy-map-server_0.7.9-1.zip"
SRC_URI[md5sum] = "f0558973cd5017a6c76b5c30e8bab962"
SRC_URI[sha256sum] = "ce9b8eb0e434aeee9b8909fe48b6ca44f778c9e33a14b75b15f70108a3820891"

S = "${WORKDIR}/demos-release-release-dashing-dummy_map_server-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

