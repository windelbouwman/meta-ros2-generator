
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


SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/dashing/rosidl_generator_py/0.7.7-1.zip;downloadfilename=rosidl-generator-py_0.7.7-1.zip"
SRC_URI[md5sum] = "e9225fc31e12263f1430489cbd869088"
SRC_URI[sha256sum] = "ed384d174907f688e2de9d4902cd17dea18b81863a5219b7e263223d476bcedc"

S = "${WORKDIR}/rosidl_python-release-release-dashing-rosidl_generator_py-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

