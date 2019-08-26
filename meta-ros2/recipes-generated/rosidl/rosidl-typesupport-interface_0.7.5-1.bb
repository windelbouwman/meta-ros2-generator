
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The interface for rosidl typesupport packages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_typesupport_interface/0.7.5-1.zip;downloadfilename=rosidl-typesupport-interface_0.7.5-1.zip"
SRC_URI[md5sum] = "515a597727f4633146b754d725752773"
SRC_URI[sha256sum] = "35f29347202f0197caa69fde52298bc5400cce0510cbe313529b05430a27833a"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_typesupport_interface-0.7.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

