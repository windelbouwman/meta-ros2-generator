
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_package-release/archive/release/dashing/ament_package/0.7.0-0.zip;downloadfilename=ament-package_0.7.0-0.zip"
SRC_URI[md5sum] = "a06bedebffc43f232f6a08add521aeaf"
SRC_URI[sha256sum] = "5beb230efb5a29888d03ea055c5dd5865444d7d0567a8240f614f860b1d49a07"

S = "${WORKDIR}/ament_package-release-release-dashing-ament_package-0.7.0-0"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

