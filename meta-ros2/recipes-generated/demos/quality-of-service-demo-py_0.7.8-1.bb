
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Python Demo applications for Quality of Service features"
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rclpy std-msgs"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/dashing/quality_of_service_demo_py/0.7.8-1.zip;downloadfilename=quality-of-service-demo-py_0.7.8-1.zip"
SRC_URI[md5sum] = "b8ee3a78299497309913de188dc083d6"
SRC_URI[sha256sum] = "bd24ba45a4fe64447a2fcb343f98103aee687aa38f5be81b728b0caec4b3d569"

S = "${WORKDIR}/demos-release-release-dashing-quality_of_service_demo_py-0.7.8-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

