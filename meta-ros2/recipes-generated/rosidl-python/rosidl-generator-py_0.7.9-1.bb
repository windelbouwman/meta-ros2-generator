
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the ROS interfaces in Python."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "rmw"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native ament-index-python-native python-cmake-module-native rosidl-cmake-native rosidl-typesupport-c-native rosidl-typesupport-interface-native"
ROS_EXEC_DEPENDS = "python3-numpy rmw-implementation rmw-implementation-cmake rosidl-generator-c rosidl-parser"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-index-python ament-lint-auto ament-lint-common python-cmake-module python3-numpy python3-pytest rmw rmw-implementation rmw-implementation-cmake rosidl-cmake rosidl-generator-c rosidl-parser rosidl-typesupport-c"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/rosidl_generator_py/0.7.9-1.zip;downloadfilename=rosidl-generator-py_0.7.9-1.zip"
SRC_URI[md5sum] = "70e4249f9c7ae22bf611763cd574e2cc"
SRC_URI[sha256sum] = "75cc1e567f10cb5f36666b733f2eba0d0029bb10d942d6646ee4994f886d1d03"

S = "${WORKDIR}/rosidl_python-release-release-dashing-rosidl_generator_py-0.7.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

