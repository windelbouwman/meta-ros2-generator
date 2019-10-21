
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package to create tests which involve launch files and multiple processes."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python launch"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 launch python3-mock python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/dashing/launch_testing/0.8.7-1.zip;downloadfilename=launch-testing_0.8.7-1.zip"
SRC_URI[md5sum] = "565d27b36bfac1531ffcb6bb5b6ebdf7"
SRC_URI[sha256sum] = "37a6ceb283d1f713a7226a879caf55c18b5f6ca8fe2aac56b279d4cc2bc1c30e"

S = "${WORKDIR}/launch-release-release-dashing-launch_testing-0.8.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

