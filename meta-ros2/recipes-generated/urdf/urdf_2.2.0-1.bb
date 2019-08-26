
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package contains a C++ parser for the Unified Robot Description Format (URDF), which is an XML format for representing a robot model. The code API of the parser has been through our review process and will remain backwards compatible in future releases. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "tinyxml tinyxml-vendor urdfdom urdfdom-headers"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "tinyxml urdfdom-headers"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "tinyxml tinyxml-vendor urdfdom urdfdom-headers"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/urdf-release/archive/release/dashing/urdf/2.2.0-1.zip;downloadfilename=urdf_2.2.0-1.zip"
SRC_URI[md5sum] = "70cb5e536f3e0906df51bac1dff8b182"
SRC_URI[sha256sum] = "e750bf01933c7591208ebf5b917720f318e4d291532070b1c79b43f51826b6ef"

S = "${WORKDIR}/urdf-release-release-dashing-urdf-2.2.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

