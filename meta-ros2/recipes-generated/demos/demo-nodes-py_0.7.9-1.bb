
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


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/demo_nodes_py/0.7.9-1.zip;downloadfilename=demo-nodes-py_0.7.9-1.zip"
SRC_URI[md5sum] = "591a86d739183fb030afbb07ce50bd2a"
SRC_URI[sha256sum] = "f1f89f8b7c7d4b8ebcd14c00ab69e9907884be19a5fedc9830c1d0e4c62fa452"

S = "${WORKDIR}/demos-release-release-dashing-demo_nodes_py-0.7.9-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

