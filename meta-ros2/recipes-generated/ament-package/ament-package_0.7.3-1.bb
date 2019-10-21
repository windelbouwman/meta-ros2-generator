
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The parser for the manifest files in the ament buildsystem."
SECTION = "devel"

ROS_BUILD_DEPENDS = "python3-setuptools"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "python3-setuptools"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-setuptools"
ROS_TEST_DEPENDS = "python3-flake8 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=9ed539f6175b7e00bfd99b36cfbcbd73"


SRC_URI = "https://github.com/ros2-gbp/ament_package-release/archive/release/dashing/ament_package/0.7.3-1.zip;downloadfilename=ament-package_0.7.3-1.zip"
SRC_URI[md5sum] = "f16cb5f93539a336dbc3fcec8006dc27"
SRC_URI[sha256sum] = "889917c6af21aa409c1be22b9072e73b013bdc71dcda6f342253ebb74a95dc8c"

S = "${WORKDIR}/ament_package-release-release-dashing-ament_package-0.7.3-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

