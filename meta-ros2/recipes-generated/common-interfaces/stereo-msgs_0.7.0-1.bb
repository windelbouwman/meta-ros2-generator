
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some stereo camera related message definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "sensor-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime sensor-msgs std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/stereo_msgs/0.7.0-1.zip;downloadfilename=stereo-msgs_0.7.0-1.zip"
SRC_URI[md5sum] = "af308bf86a32c442ee1691180947d117"
SRC_URI[sha256sum] = "3e109d847cd21b0b3b69a4545e6397ec7586b61c78bcd06f01f074819f2ead8c"

S = "${WORKDIR}/common_interfaces-release-release-dashing-stereo_msgs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

