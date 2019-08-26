
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_action provides a feature to introspect all available ROS action types. By utilizing rqt_msg, the output format is unified with it and rqt_srv. Note that the actions shown on this plugin is the ones that are stored on your machine, not on the ROS core your rqt instance connects to."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding rclpy rqt-gui rqt-gui-py rqt-msg rqt-py-common"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_action-release/archive/release/dashing/rqt_action/1.0.1-1.zip;downloadfilename=rqt-action_1.0.1-1.zip"
SRC_URI[md5sum] = "7cd162febf30be016dc4840e430f0d2b"
SRC_URI[sha256sum] = "8e9797550a7344a78407b99c1e52388dbf71cff10ea112acec17b865f216bf22"

S = "${WORKDIR}/rqt_action-release-release-dashing-rqt_action-1.0.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

