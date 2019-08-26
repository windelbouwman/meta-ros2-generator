
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some standard service definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/std_srvs/0.7.0-1.zip;downloadfilename=std-srvs_0.7.0-1.zip"
SRC_URI[md5sum] = "1da58bbb07a0ad61d04484fe5c371a45"
SRC_URI[sha256sum] = "9575b6463aeb7bc8bb7eb04d321df8884fa06d3d42a57a8883f8ef870ef44f2e"

S = "${WORKDIR}/common_interfaces-release-release-dashing-std_srvs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

