
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code against style conventions using clang-format and generate xUnit test result files."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "clang-format python3-yaml"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_clang_format/0.7.7-1.zip;downloadfilename=ament-clang-format_0.7.7-1.zip"
SRC_URI[md5sum] = "6f7e7d8ce7a0be7e6b13a071b2878250"
SRC_URI[sha256sum] = "4ad5266a3b079ccb83679a0a77fd29b5149328bff46f6e9b34404c15a49e90bc"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_clang_format-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

