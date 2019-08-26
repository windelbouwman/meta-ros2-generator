
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the type support for C messages."
SECTION = "devel"

ROS_BUILD_DEPENDS = "libpoco-dev poco-vendor rosidl-generator-c rosidl-typesupport-connext-c rosidl-typesupport-introspection-c rosidl-typesupport-opensplice-c"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "rmw-implementation rosidl-generator-c"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-core-native"
ROS_EXEC_DEPENDS = "libpoco-dev poco-vendor rosidl-typesupport-interface"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport-release/archive/release/dashing/rosidl_typesupport_c/0.7.1-1.zip;downloadfilename=rosidl-typesupport-c_0.7.1-1.zip"
SRC_URI[md5sum] = "6f047cd2d86f64110fba06d80a70cd27"
SRC_URI[sha256sum] = "bef03d6f025af4236a9c52be35706c0f3443bc4b341e65fac180e023ac0f33d4"

S = "${WORKDIR}/rosidl_typesupport-release-release-dashing-rosidl_typesupport_c-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

