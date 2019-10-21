
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code using pyflakes and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "pyflakes3"
ROS_TEST_DEPENDS = "ament-pep8 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_pyflakes/0.7.11-1.zip;downloadfilename=ament-pyflakes_0.7.11-1.zip"
SRC_URI[md5sum] = "f00220c27a4294e260afedd7521601cd"
SRC_URI[sha256sum] = "6ae9efd32b4ddbedee054ae8c1a5111810fa011156ff42ec7e7526f5108e8fb9"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_pyflakes-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

