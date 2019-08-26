
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Template based exceptions - these are simple and practical and avoid the proliferation of exception types. Although not syntatactically ideal, it is convenient and eminently practical. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-errors ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_exceptions/1.0.1-1.zip;downloadfilename=ecl-exceptions_1.0.1-1.zip"
SRC_URI[md5sum] = "4ff91973b443bf294bfa50bafdbbbcaf"
SRC_URI[sha256sum] = "d6756ceb21ef4a1dd393ed27dafa967366ff7fc7b103648ff79e77db1eaa9f11"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_exceptions-1.0.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

