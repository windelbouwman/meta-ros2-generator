
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check source files for copyright and license information. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-lint"
ROS_TEST_DEPENDS = "ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ee09441fd2874bd55740e281e9f11b69"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_copyright/0.7.7-1.zip;downloadfilename=ament-copyright_0.7.7-1.zip"
SRC_URI[md5sum] = "52967e3b27692c31f77d6ab109c03a6c"
SRC_URI[sha256sum] = "57de20f16669861145937c179d7f02a1680762f47f0bc730d9150ebfd9e8e47d"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_copyright-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

