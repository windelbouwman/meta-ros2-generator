
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Provides small examples for use of the fmi_adapter package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "fmi-adapter"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "fmi-adapter launch launch-ros"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/boschresearch/fmi_adapter_ros2-release/archive/release/dashing/fmi_adapter_examples/0.1.5-1.zip;downloadfilename=fmi-adapter-examples_0.1.5-1.zip"
SRC_URI[md5sum] = "f2958d6a624b837a12e5f10f9f7fa3b4"
SRC_URI[sha256sum] = "fc016b1fee48d6baa18501931eaf1b93316f91b97a1beaebfba145bbbc99a4d6"

S = "${WORKDIR}/fmi_adapter_ros2-release-release-dashing-fmi_adapter_examples-0.1.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

