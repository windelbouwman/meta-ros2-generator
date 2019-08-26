
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types. Note that the srvs available through this plugin is the ones that are stored on your machine, not on the ROS core your rqt instance connects to."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclpy rqt-gui rqt-gui-py rqt-msg"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_srv-release/archive/release/dashing/rqt_srv/1.0.1-1.zip;downloadfilename=rqt-srv_1.0.1-1.zip"
SRC_URI[md5sum] = "3527f699862b93fffc845efa78f13f92"
SRC_URI[sha256sum] = "5ed08d17b34f1f77467b6fc139ae7cf5a64a222cb8454f2588ba6ae950cd9d2f"

S = "${WORKDIR}/rqt_srv-release-release-dashing-rqt_srv-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

