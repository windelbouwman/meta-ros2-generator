
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " API and scripts to parse .msg/.srv/.action files and convert them to .idl. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-cmake"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python3-empy"
ROS_TEST_DEPENDS = "ament-cmake-pytest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_adapter/0.7.5-1.zip;downloadfilename=rosidl-adapter_0.7.5-1.zip"
SRC_URI[md5sum] = "8f894d2c221261bc778bb0a8b299b74e"
SRC_URI[sha256sum] = "e6032f065512aa9276edf45c4bc92cf4681999a6f4c7d76ec5bc6b2ecee28eaa"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_adapter-0.7.5-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

