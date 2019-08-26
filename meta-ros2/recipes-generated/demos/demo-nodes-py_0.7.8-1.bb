
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Python nodes which were previously in the ros2/examples repository but are now just used for demo purposes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "example-interfaces rclpy std-msgs"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/demo_nodes_py/0.7.8-1.zip;downloadfilename=demo-nodes-py_0.7.8-1.zip"
SRC_URI[md5sum] = "0966736dbb40dc4a35cf8c794f5548b3"
SRC_URI[sha256sum] = "5fc6c0cd6018f97edd8be9821b241e9185e16c0c2d5cdb3505a353bd825fc422"

S = "${WORKDIR}/demos-release-release-dashing-demo_nodes_py-0.7.8-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

