
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The list of commonly used linters in the ament buildsytem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native ament-cmake-export-dependencies-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native"
ROS_EXEC_DEPENDS = "ament-cmake-copyright ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-flake8 ament-cmake-lint-cmake ament-cmake-pep257 ament-cmake-uncrustify ament-cmake-xmllint"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_lint_common/0.7.11-1.zip;downloadfilename=ament-lint-common_0.7.11-1.zip"
SRC_URI[md5sum] = "995d1a10f01e496159b8a83d6e1393be"
SRC_URI[sha256sum] = "44544c54aff451a94a33fad3f7496c297643c3c939ffa8b9b336a2c8eca3bf7d"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_lint_common-0.7.11-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

