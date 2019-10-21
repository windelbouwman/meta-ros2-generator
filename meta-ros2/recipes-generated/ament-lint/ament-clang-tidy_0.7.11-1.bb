
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code against style conventions using clang-tidy and generate xUnit test result files."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "clang-tidy python3-yaml"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_clang_tidy/0.7.11-1.zip;downloadfilename=ament-clang-tidy_0.7.11-1.zip"
SRC_URI[md5sum] = "4082755a418615dd013eae985b0d8f05"
SRC_URI[sha256sum] = "367761124a5d67c013ca2a648b85b1037876323bc5380315c3d1d52e995565b0"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_clang_tidy-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

