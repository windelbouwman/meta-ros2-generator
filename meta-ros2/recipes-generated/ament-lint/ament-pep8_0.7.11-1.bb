
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code against the style conventions in PEP 8 and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-pep8"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_pep8/0.7.11-1.zip;downloadfilename=ament-pep8_0.7.11-1.zip"
SRC_URI[md5sum] = "969b69c0a689326092b3ed0b99b925f7"
SRC_URI[sha256sum] = "4b92f22c7a7000828996e99c3a04b325805ca295eca30b14104a1ca64d624f51"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_pep8-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

