
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code for style and syntax conventions with flake8. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-lint python3-flake8"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_flake8/0.7.11-1.zip;downloadfilename=ament-flake8_0.7.11-1.zip"
SRC_URI[md5sum] = "583e1576a5e6f9cb58513344148ca2be"
SRC_URI[sha256sum] = "5a9dd0d9f00c9924db526f453eedeb05a7d744e987a8bdc4a65004bb295c79d6"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_flake8-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

