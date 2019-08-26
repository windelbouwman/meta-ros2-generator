
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types. Note that the msgs available through this plugin is the ones that are stored on your machine, not on the ROS core your rqt instance connects to. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding python3-catkin-pkg-modules rclpy rqt-console rqt-gui rqt-gui-py rqt-py-common"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_msg-release/archive/release/dashing/rqt_msg/1.0.2-1.zip;downloadfilename=rqt-msg_1.0.2-1.zip"
SRC_URI[md5sum] = "0e695eecf2d184a194cebc633769ca6c"
SRC_URI[sha256sum] = "107d0b1bc0cb06a4f5aa1d5648eed44c1e5e0bd6e0ed8ffdd9644733f16a9081"

S = "${WORKDIR}/rqt_msg-release-release-dashing-rqt_msg-1.0.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

