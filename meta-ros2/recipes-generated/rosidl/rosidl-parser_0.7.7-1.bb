
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The parser for ROS interface files."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-lark-parser rosidl-adapter"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_parser/0.7.7-1.zip;downloadfilename=rosidl-parser_0.7.7-1.zip"
SRC_URI[md5sum] = "a2d4e9c7611f8963cab72542773f8cf8"
SRC_URI[sha256sum] = "1829db663ced7b627f2597a3c5b2fcbc2cc03f178d90c21ccd65242ea2ad8853"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_parser-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

