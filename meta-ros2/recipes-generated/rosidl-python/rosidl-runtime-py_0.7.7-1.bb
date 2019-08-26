
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Runtime utilities for working with generated ROS interfaces in Python."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-numpy python3-yaml rosidl-parser"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/rosidl_runtime_py/0.7.7-1.zip;downloadfilename=rosidl-runtime-py_0.7.7-1.zip"
SRC_URI[md5sum] = "3f3ca0cd0b4721e9f11681a4e6976e0e"
SRC_URI[sha256sum] = "b8fbf7cfe2cd880f684b3b6e755c8fa1143af647c10e636709dfe0a78ba253b9"

S = "${WORKDIR}/rosidl_python-release-release-dashing-rosidl_runtime_py-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

