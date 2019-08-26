
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "A package containing some geometry related message definitions."
SECTION = "devel"

ROS_BUILD_DEPENDS = "std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "rosidl-default-runtime std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/dashing/geometry_msgs/0.7.0-1.zip;downloadfilename=geometry-msgs_0.7.0-1.zip"
SRC_URI[md5sum] = "35af538161c3500c181cdf75e9405150"
SRC_URI[sha256sum] = "22eabc51819a11f894bf3168e038b456ec0e5a475dc407f69b786c63f9966f06"

S = "${WORKDIR}/common_interfaces-release-release-dashing-geometry_msgs-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

