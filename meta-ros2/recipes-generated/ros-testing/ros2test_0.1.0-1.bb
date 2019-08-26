
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The test command for ROS 2 launch tests."
SECTION = "devel"

ROS_BUILD_DEPENDS = "launch launch-ros launch-testing launch-testing-ros ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "launch launch-ros launch-testing launch-testing-ros ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "launch launch-ros launch-testing launch-testing-ros ros2cli"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros_testing-release/archive/release/dashing/ros2test/0.1.0-1.zip;downloadfilename=ros2test_0.1.0-1.zip"
SRC_URI[md5sum] = "5eed497dd6f4ba3d5142641889364ad9"
SRC_URI[sha256sum] = "a5e363885ade96a6c335a41b923df04088e0f7afc5e77a24c07ede5f2082796e"

S = "${WORKDIR}/ros_testing-release-release-dashing-ros2test-0.1.0-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

