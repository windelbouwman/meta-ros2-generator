
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provide CMake module to find Eclipse CycloneDDS."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rmw_cyclonedds-release/archive/release/dashing/cyclonedds_cmake_module/0.4.0-1.zip;downloadfilename=cyclonedds-cmake-module_0.4.0-1.zip"
SRC_URI[md5sum] = "e94520f57e1d319f23078094cf69081f"
SRC_URI[sha256sum] = "1aebb76160e60052685884e340203258b37d40b5b1f643cd8e2a76972a4c199d"

S = "${WORKDIR}/rmw_cyclonedds-release-release-dashing-cyclonedds_cmake_module-0.4.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

