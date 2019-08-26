
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to lint CMake code using cmakelint and generate xUnit test result files. "
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_lint_cmake/0.7.7-1.zip;downloadfilename=ament-lint-cmake_0.7.7-1.zip"
SRC_URI[md5sum] = "0acef3d9314a3799d4716947618834fa"
SRC_URI[sha256sum] = "8eeac25fea2086e8befaa740ce4159023a1569bf438b0ce8dfcad9c7cd65bc9b"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_lint_cmake-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

