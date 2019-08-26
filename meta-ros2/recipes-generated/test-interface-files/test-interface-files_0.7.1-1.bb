
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing message definitions and fixtures used exclusively for testing purposes."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/test_interface_files-release/archive/release/dashing/test_interface_files/0.7.1-1.zip;downloadfilename=test-interface-files_0.7.1-1.zip"
SRC_URI[md5sum] = "cf89b03e4bb7247986c33877d949759f"
SRC_URI[sha256sum] = "07acd95543b7b9e2ee07d02735ef7ad639d5a9267d41c4fc275777dc72c39a0b"

S = "${WORKDIR}/test_interface_files-release-release-dashing-test_interface_files-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

