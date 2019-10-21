
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical user interface provided by qt_gui."
SECTION = "devel"

ROS_BUILD_DEPENDS = "qt-gui"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding python3-catkin-pkg-modules qt-gui rclpy"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/dashing/rqt_gui/1.0.5-1.zip;downloadfilename=rqt-gui_1.0.5-1.zip"
SRC_URI[md5sum] = "57df308b1b587ce993fc695de5d361ed"
SRC_URI[sha256sum] = "a60c5b99b7e8aac665d689949ea1be7d5ddddf3fe15cd7f38df6d3190dcbf678"

S = "${WORKDIR}/rqt-release-release-dashing-rqt_gui-1.0.5-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

