
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_gui_py enables GUI plugins to use the Python client library for ROS."
SECTION = "devel"

ROS_BUILD_DEPENDS = "qt-gui rqt-gui"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "qt-gui rqt-gui"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_gui_py/1.0.5-1.zip;downloadfilename=rqt-gui-py_1.0.5-1.zip"
SRC_URI[md5sum] = "5be5a23979a108a435f4f68641bc2120"
SRC_URI[sha256sum] = "aab3e580d7f8ffc2d189c81a6a71e03bd484c3b49d0c24bc9e036bfb861559ae"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_gui_py-1.0.5-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

