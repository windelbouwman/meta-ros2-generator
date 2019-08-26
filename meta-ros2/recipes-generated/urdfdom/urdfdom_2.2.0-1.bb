
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A library to access URDFs using the DOM model."
SECTION = "devel"

ROS_BUILD_DEPENDS = "console-bridge-vendor libconsole-bridge-dev tinyxml tinyxml-vendor urdfdom-headers"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "console-bridge-vendor libconsole-bridge-dev tinyxml tinyxml-vendor urdfdom-headers"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/urdfdom-release/archive/release/dashing/urdfdom/2.2.0-1.zip;downloadfilename=urdfdom_2.2.0-1.zip"
SRC_URI[md5sum] = "7318098c49e2f198b55456d57a721357"
SRC_URI[sha256sum] = "c612eaf8bf22db9f8d68abb78a8986c6e0b54f4a2e0e3ad5989c038fc95eb1c3"

S = "${WORKDIR}/urdfdom-release-release-dashing-urdfdom-2.2.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

