
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check XML files like the package manifest using xmllint and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-lint libxml2-utils"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_xmllint/0.7.11-1.zip;downloadfilename=ament-xmllint_0.7.11-1.zip"
SRC_URI[md5sum] = "c65edfab2ceb27769b070b73c298bbb5"
SRC_URI[sha256sum] = "8f8b1e93023323cb3f7a35d629e94b7a40b6b5a4adccefea2ac8e5594c31fd76"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_xmllint-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

