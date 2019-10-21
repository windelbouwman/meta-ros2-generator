
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The interface for rosidl typesupport packages. "
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
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_typesupport_interface/0.7.7-1.zip;downloadfilename=rosidl-typesupport-interface_0.7.7-1.zip"
SRC_URI[md5sum] = "73e0515771c518883b603e6a7b36a48c"
SRC_URI[sha256sum] = "1e3003abbf9c76050cf891b74c120a6c25cf39b06576bd82cf4e90bf8e23ee14"

S = "${WORKDIR}/rosidl-release-release-dashing-rosidl_typesupport_interface-0.7.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

