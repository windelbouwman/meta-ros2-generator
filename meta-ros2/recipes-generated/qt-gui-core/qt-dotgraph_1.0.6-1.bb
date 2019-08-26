
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " qt_dotgraph provides helpers to work with dot graphs. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding python3-pydot"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common python3-pygraphviz"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_dotgraph/1.0.6-1.zip;downloadfilename=qt-dotgraph_1.0.6-1.zip"
SRC_URI[md5sum] = "f16b60f64bc4405216aee0704f4ad0b9"
SRC_URI[sha256sum] = "1628ea8dc47a9d3069d4b9db1b9a268fe03bea6878c47953ef00f6a04251e0ab"

S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_dotgraph-1.0.6-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

