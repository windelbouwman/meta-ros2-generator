
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Framework for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-pkg-resources rclpy"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2cli/0.7.4-1.zip;downloadfilename=ros2cli_0.7.4-1.zip"
SRC_URI[md5sum] = "ec42e5eaab7c7a56aaac6d9990d9d751"
SRC_URI[sha256sum] = "12ea9c503a1c3cb35545ba89edd65cb634b609e59a461bd996ecfb0a90c0a171"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2cli-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

