
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code against the Google style conventions using cpplint and generate xUnit test result files."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cpplint/0.7.11-1.zip;downloadfilename=ament-cpplint_0.7.11-1.zip"
SRC_URI[md5sum] = "27598c0f855240fffa30e8189d21280e"
SRC_URI[sha256sum] = "c87e71d060c8ae2af91beb287ee6ba95f4419d8abdd762d1f96b5078291d2869"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cpplint-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

