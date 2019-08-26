
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to perform static code analysis on C/C++ code using Cppcheck and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "cppcheck"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cppcheck/0.7.7-1.zip;downloadfilename=ament-cppcheck_0.7.7-1.zip"
SRC_URI[md5sum] = "2d1c01fc068b687e7594c5684cfd0a57"
SRC_URI[sha256sum] = "fb26e63c7dcfb94b20b2993629415e0dc2f5f59957f084c1008c09971853766a"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cppcheck-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

