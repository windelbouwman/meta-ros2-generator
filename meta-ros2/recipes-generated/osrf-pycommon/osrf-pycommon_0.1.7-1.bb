
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Commonly needed Python modules, used by Python software developed at OSRF."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-mock python3-mock"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/osrf_pycommon-release/archive/release/dashing/osrf_pycommon/0.1.7-1.zip;downloadfilename=osrf-pycommon_0.1.7-1.zip"
SRC_URI[md5sum] = "9001d828cf6a84aa4b414d02af1afc95"
SRC_URI[sha256sum] = "6e398b2b670529a037dc0c77b356cbab47eff00a617154639b74ae1ddb56250d"

S = "${WORKDIR}/osrf_pycommon-release-release-dashing-osrf_pycommon-0.1.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

