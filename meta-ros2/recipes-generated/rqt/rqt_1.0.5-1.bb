
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt is a Qt-based framework for GUI development for ROS. It consists of three parts/metapackages"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rqt-gui rqt-gui-cpp rqt-gui-py rqt-py-common"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt/1.0.5-1.zip;downloadfilename=rqt_1.0.5-1.zip"
SRC_URI[md5sum] = "1f2fae3958ddfd31b17274fc7f7e36d3"
SRC_URI[sha256sum] = "ad98bb1375205b770a41d9175ceff63b10dbe70aed6158d5c62831e324d026fe"

S = "${WORKDIR}/rqt-release-release-dashing-rqt-1.0.5-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

