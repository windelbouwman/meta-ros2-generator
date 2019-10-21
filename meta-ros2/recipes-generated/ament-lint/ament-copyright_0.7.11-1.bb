
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_copyright/0.7.11-1.zip;downloadfilename=ament-copyright_0.7.11-1.zip"
SRC_URI[md5sum] = "e15608ad6f060bfa90e02080a71f050f"
SRC_URI[sha256sum] = "5d500957cf308d8a189fae894f4fff17652a7159eef077b85a71eb4ba4a21ad7"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_copyright-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

