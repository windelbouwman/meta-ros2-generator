
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


SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/rosidl_runtime_py/0.7.9-1.zip;downloadfilename=rosidl-runtime-py_0.7.9-1.zip"
SRC_URI[md5sum] = "c5e3bb65d38197e68d7a8146022727d6"
SRC_URI[sha256sum] = "966750563fd36ec7e13d7c4961b05d3d0e721c846833e96c3fad91e0c672b4d8"

S = "${WORKDIR}/rosidl_python-release-release-dashing-rosidl_runtime_py-0.7.9-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

