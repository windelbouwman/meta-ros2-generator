
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to perform static code analysis on C/C++ code using pclint and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_pclint/0.7.11-1.zip;downloadfilename=ament-pclint_0.7.11-1.zip"
SRC_URI[md5sum] = "1fdb6cd9446fd91553422e8c11b1103c"
SRC_URI[sha256sum] = "d94ed260426ee9fa994c1bb64ac6b63b7acdd306b06e04054b4572d8040a646c"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_pclint-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

