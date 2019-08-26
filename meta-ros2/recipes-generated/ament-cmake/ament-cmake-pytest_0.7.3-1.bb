
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "The ability to run Python tests using pytest in the ament buildsystem in CMake."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-core-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native ament-cmake-test-native python3-pytest-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_pytest/0.7.3-1.zip;downloadfilename=ament-cmake-pytest_0.7.3-1.zip"
SRC_URI[md5sum] = "7f988ead455e5772d73117609702ec27"
SRC_URI[sha256sum] = "159452b3a0de8bd626c6761c941e3d4f93484960a6648b4ace42568d8c246b9d"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_pytest-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

