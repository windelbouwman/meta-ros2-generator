
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Pythonic implementation of behaviour trees. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "python3-setuptools"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-pydot"
ROS_TEST_DEPENDS = "python3-nose python3-nose-yanc"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/dashing/py_trees/1.2.2-1.zip;downloadfilename=py-trees_1.2.2-1.zip"
SRC_URI[md5sum] = "8786c2acb07769fc76edad1ad2b85c1b"
SRC_URI[sha256sum] = "94ad38d5f100e55c78840b2607e725831f194f1c66154c0c9b6ac5d6168ddbf8"

S = "${WORKDIR}/py_trees-release-release-dashing-py_trees-1.2.2-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

