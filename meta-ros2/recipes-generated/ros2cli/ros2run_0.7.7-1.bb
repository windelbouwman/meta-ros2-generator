
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The run command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ros2cli ros2pkg"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2run/0.7.7-1.zip;downloadfilename=ros2run_0.7.7-1.zip"
SRC_URI[md5sum] = "cfa300f36abc90eae4f5ed84da98cdc2"
SRC_URI[sha256sum] = "2ee0b1fb645ca91cd497ebebef10abfbdc876aa91c28e52f7d0c3d08d332030a"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2run-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

