
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Providing common API for ament linter packages. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_lint/0.7.7-1.zip;downloadfilename=ament-lint_0.7.7-1.zip"
SRC_URI[md5sum] = "bebc7288dcaa811346ef31bdda9ae8a3"
SRC_URI[sha256sum] = "0718cd229b99521f59162711b2457a98f9c9b79b11e82ac9bee2ced10c4c737e"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_lint-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

