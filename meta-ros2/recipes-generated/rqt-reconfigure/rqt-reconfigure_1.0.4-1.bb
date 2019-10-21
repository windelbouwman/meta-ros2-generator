
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This rqt plugin provides a way to view and edit parameters on nodes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding python3-yaml qt-gui-py-common rclpy rqt-console rqt-gui rqt-gui-py rqt-py-common"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-xmllint"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_reconfigure-release/archive/release/dashing/rqt_reconfigure/1.0.4-1.zip;downloadfilename=rqt-reconfigure_1.0.4-1.zip"
SRC_URI[md5sum] = "9f5401a0282d37cfc1c78195f2227404"
SRC_URI[sha256sum] = "c9319e1b8ca1b0901b761ebf1c2b9c92621ac5d58ab81ba4b18a86218d820751"

S = "${WORKDIR}/rqt_reconfigure-release-release-dashing-rqt_reconfigure-1.0.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

