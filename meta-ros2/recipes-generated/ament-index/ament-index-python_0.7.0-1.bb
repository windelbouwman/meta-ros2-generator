
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Python API to access the ament resource index. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/dashing/ament_index_python/0.7.0-1.zip;downloadfilename=ament-index-python_0.7.0-1.zip"
SRC_URI[md5sum] = "09858c069e024d86702e4fde21e1aba0"
SRC_URI[sha256sum] = "dc4b30f66a7b43c6607bfbd7eb6a8c74f9b8810bb431a69619d6c8b5dda80a99"

S = "${WORKDIR}/ament_index-release-release-dashing-ament_index_python-0.7.0-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

