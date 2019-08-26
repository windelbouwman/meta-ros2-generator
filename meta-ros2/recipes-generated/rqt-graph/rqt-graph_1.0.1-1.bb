
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS computation graph."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python-qt-binding qt-dotgraph rqt-gui rqt-gui-py"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_graph-release/archive/release/dashing/rqt_graph/1.0.1-1.zip;downloadfilename=rqt-graph_1.0.1-1.zip"
SRC_URI[md5sum] = "d0e5bfeb06bda8d0f580201967584c75"
SRC_URI[sha256sum] = "f0f31213e1ccf81801aaaa81f1ad8e0e16bd334ff5e2e31885e6a8cd77c419b9"

S = "${WORKDIR}/rqt_graph-release-release-dashing-rqt_graph-1.0.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

