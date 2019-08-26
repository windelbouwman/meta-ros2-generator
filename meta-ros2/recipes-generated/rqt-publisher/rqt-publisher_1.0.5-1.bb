
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed or computed field values."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding python3-catkin-pkg-modules qt-gui-py-common rqt-gui rqt-gui-py rqt-py-common"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_publisher-release/archive/release/dashing/rqt_publisher/1.0.5-1.zip;downloadfilename=rqt-publisher_1.0.5-1.zip"
SRC_URI[md5sum] = "66b6dbb0ee8c8982be52e3aee12dbff9"
SRC_URI[sha256sum] = "af6d7f45a501eccb03482b2aa26a5c11c961763af74c75b9efdb19955fb13955"

S = "${WORKDIR}/rqt_publisher-release-release-dashing-rqt_publisher-1.0.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

