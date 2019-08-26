
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_service_caller provides a GUI plugin for calling arbitrary services."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rqt-gui rqt-gui-py rqt-py-common"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_service_caller-release/archive/release/dashing/rqt_service_caller/1.0.3-1.zip;downloadfilename=rqt-service-caller_1.0.3-1.zip"
SRC_URI[md5sum] = "3bf677ed85e91d3fcda82287d0702929"
SRC_URI[sha256sum] = "41cad6ea50c8ffec41180fd3246e8a5034a5467022261eb9c928460be5a4be6a"

S = "${WORKDIR}/rqt_service_caller-release-release-dashing-rqt_service_caller-1.0.3-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

