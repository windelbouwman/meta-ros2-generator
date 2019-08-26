
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
SECTION = "devel"

ROS_BUILD_DEPENDS = "boost cmake eigen pkg-config"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/dashing/ompl/1.4.2-2.zip;downloadfilename=ompl_1.4.2-2.zip"
SRC_URI[md5sum] = "ccc57488eb99878ed095894b31674493"
SRC_URI[sha256sum] = "6f19d7503d3f4c487652e9a08453801d8679f49a1168001bfaeccdbee1ad1911"

S = "${WORKDIR}/ompl-release-release-dashing-ompl-1.4.2-2"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

