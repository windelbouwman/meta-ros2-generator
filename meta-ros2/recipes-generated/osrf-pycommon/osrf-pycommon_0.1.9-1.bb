
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


SRC_URI = "https://github.com/ros2-gbp/osrf_pycommon-release/archive/release/dashing/osrf_pycommon/0.1.9-1.zip;downloadfilename=osrf-pycommon_0.1.9-1.zip"
SRC_URI[md5sum] = "6db101d13622fc12c97322ee304fc826"
SRC_URI[sha256sum] = "56a3e44861ce296606c69925624975480f3fe4552eabe7ca414a7f8aab00d840"

S = "${WORKDIR}/osrf_pycommon-release-release-dashing-osrf_pycommon-0.1.9-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

