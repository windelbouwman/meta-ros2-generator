
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Xacro (XML Macros) Xacro is an XML macro language. With xacro, you can construct shorter and more readable XML files by using macros that expand to larger XML expressions. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-python python3-yaml"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-python python3-yaml"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python3-yaml"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros-gbp/xacro-release/archive/release/dashing/xacro/2.0.1-2.zip;downloadfilename=xacro_2.0.1-2.zip"
SRC_URI[md5sum] = "e8c79f871cb3a82442d59123c6a2b9c3"
SRC_URI[sha256sum] = "a047efd6a37483afd5d09c4dc87e577b5877cb394cb7a75c88e94c236c31b9cf"

S = "${WORKDIR}/xacro-release-release-dashing-xacro-2.0.1-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

