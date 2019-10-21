
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Qt-based viewer for py_trees in ROS. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "pyqt5-dev-tools python3-setuptools qttools5-dev-tools"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-pyqt5.qtwebengine python3-qt5-bindings"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees_js-release/archive/release/dashing/py_trees_js/0.5.0-1.zip;downloadfilename=py-trees-js_0.5.0-1.zip"
SRC_URI[md5sum] = "8e48a99d868be4f515e360ad3beb9aba"
SRC_URI[sha256sum] = "e4dda32a839ac806136c35e77eacecadbd32593aad6dcb7c94915fcd0e7c9ba4"

S = "${WORKDIR}/py_trees_js-release-release-dashing-py_trees_js-0.5.0-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

