
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


SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/dashing/py_trees/1.3.0-1.zip;downloadfilename=py-trees_1.3.0-1.zip"
SRC_URI[md5sum] = "84a693f2f554cd93bee537a1441a098a"
SRC_URI[sha256sum] = "a883d7f758ef5a7946ea2e3039ac8c6b48d170c44466383f8daaffb3c5ae2bee"

S = "${WORKDIR}/py_trees-release-release-dashing-py_trees-1.3.0-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

