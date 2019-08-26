
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_xmllint/0.7.7-1.zip;downloadfilename=ament-xmllint_0.7.7-1.zip"
SRC_URI[md5sum] = "413377ebeb499f941c203792280696e3"
SRC_URI[sha256sum] = "fc102228ea3cbad9f6f625fd596766c96a307b49270ee17f66eef21baf3d5194"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_xmllint-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

