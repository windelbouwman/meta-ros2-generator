
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_lint/0.7.11-1.zip;downloadfilename=ament-lint_0.7.11-1.zip"
SRC_URI[md5sum] = "43e4053b4dc5d9ffff7cdfa487baa4eb"
SRC_URI[sha256sum] = "6765724ee254ff3d2daae285f62fdf04cb6148790626e26502eefede9f6f097e"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_lint-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

