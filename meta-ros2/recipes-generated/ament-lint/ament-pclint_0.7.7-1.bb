
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_pclint/0.7.7-1.zip;downloadfilename=ament-pclint_0.7.7-1.zip"
SRC_URI[md5sum] = "0e7e02113aa6615194384039c3ae3cad"
SRC_URI[sha256sum] = "14ad58bc2f28e6173536ea12dcd017fa74b4e72725080975973ed0be73b2dc05"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_pclint-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

