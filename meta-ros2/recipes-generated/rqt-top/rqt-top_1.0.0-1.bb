
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "RQT plugin for monitoring ROS processes."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding python3-psutil rclpy rqt-gui rqt-gui-py"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_top-release/archive/release/dashing/rqt_top/1.0.0-1.zip;downloadfilename=rqt-top_1.0.0-1.zip"
SRC_URI[md5sum] = "e6ceead197b5290517c1dc7fa25db6f8"
SRC_URI[sha256sum] = "9ebe3d1134ef5e051856440d8fa0537e8d1fcb26837374e689ca96c75db07419"

S = "${WORKDIR}/rqt_top-release-release-dashing-rqt_top-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

