
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


SRC_URI = "https://github.com/ros2-gbp/ros_testing-release/archive/release/dashing/ros2test/0.1.1-1.zip;downloadfilename=ros2test_0.1.1-1.zip"
SRC_URI[md5sum] = "2f51a7ffe2940f3342f58f6265eb068e"
SRC_URI[sha256sum] = "c067c12aab0134d3b8edb10f82a47aeed8e648ba2166a4ed94b4013ed5deec74"

S = "${WORKDIR}/ros_testing-release-release-dashing-ros2test-0.1.1-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

