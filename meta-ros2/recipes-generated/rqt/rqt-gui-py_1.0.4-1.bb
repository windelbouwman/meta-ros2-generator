
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


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_gui_py/1.0.4-1.zip;downloadfilename=rqt-gui-py_1.0.4-1.zip"
SRC_URI[md5sum] = "dc97c60769ebbf0bd208145f221c7e56"
SRC_URI[sha256sum] = "7acab9abc50d81665db3b7e910e58cd8215822e0973394d0a7bd032c3b4eb48f"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_gui_py-1.0.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

