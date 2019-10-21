
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_cppcheck/0.7.11-1.zip;downloadfilename=ament-cppcheck_0.7.11-1.zip"
SRC_URI[md5sum] = "b2a8352ffd908af6ae239f0e5c919bc2"
SRC_URI[sha256sum] = "b75a318f3d84c7c81173f6d0fd20db87e00431ff1a51b68db269e7d8882776b7"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_cppcheck-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

