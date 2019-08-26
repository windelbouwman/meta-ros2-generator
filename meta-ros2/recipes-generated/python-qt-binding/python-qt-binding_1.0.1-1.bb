
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This stack provides Python bindings for Qt. There are two providers: pyside and pyqt.  PySide2 is available under the GPL, LGPL and a commercial license.  PyQt is released under the GPL.  Both the bindings and tools to build bindings are included from each available provider.  For PySide, it is called "Shiboken".  For PyQt, this is called "SIP".  Also provided is adapter code to make the user's Python code independent of which binding provider was actually used which makes it very easy to switch between these. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "python3-qt5-bindings qtbase5-dev"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-qt5-bindings"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ced11b5ec2a0776fd01740115328457b"


SRC_URI = "https://github.com/ros2-gbp/python_qt_binding-release/archive/release/dashing/python_qt_binding/1.0.1-1.zip;downloadfilename=python-qt-binding_1.0.1-1.zip"
SRC_URI[md5sum] = "895fd5868c5643c42740e7c9db24bef9"
SRC_URI[sha256sum] = "36d61383bdcb2baec9cc6b4992f47c0e3dec4a83f91854da30e64fcc073f1193"

S = "${WORKDIR}/python_qt_binding-release-release-dashing-python_qt_binding-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

