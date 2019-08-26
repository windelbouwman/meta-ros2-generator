
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding python3-catkin-pkg-modules qt-gui qt-gui-py-common rqt-gui rqt-gui-py"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_shell-release/archive/release/dashing/rqt_shell/1.0.0-1.zip;downloadfilename=rqt-shell_1.0.0-1.zip"
SRC_URI[md5sum] = "4793c50b00c506cf51367cd223ae0ea6"
SRC_URI[sha256sum] = "76e2c672690c1fe886486f4896184eedaa779732102044f528704f91ceaf3c34"

S = "${WORKDIR}/rqt_shell-release-release-dashing-rqt_shell-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

