
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


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_clang_format/0.7.11-1.zip;downloadfilename=ament-clang-format_0.7.11-1.zip"
SRC_URI[md5sum] = "27af235bf09b6d62b603c85f086611fa"
SRC_URI[sha256sum] = "3468bc39bf5eb58b31a4bde3eb12ea8235cdd297d5c3466100e33f29f6f1fcbb"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_clang_format-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

