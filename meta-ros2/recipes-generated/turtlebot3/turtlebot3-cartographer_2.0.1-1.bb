
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " ROS 2 launch scripts for cartographer "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cartographer-ros"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/dashing/turtlebot3_cartographer/2.0.1-1.zip;downloadfilename=turtlebot3-cartographer_2.0.1-1.zip"
SRC_URI[md5sum] = "e10f805b69e29901cf4ca83a8cb32e5f"
SRC_URI[sha256sum] = "e2e818df760a2330e94db1301cb4bf9405af61ac0185d701a3808a2323b054af"

S = "${WORKDIR}/turtlebot3-release-release-dashing-turtlebot3_cartographer-2.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

