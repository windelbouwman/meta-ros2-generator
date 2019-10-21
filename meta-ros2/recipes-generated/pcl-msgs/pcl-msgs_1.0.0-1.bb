
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package containing PCL (Point Cloud Library)-related ROS messages."
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


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/pcl_msgs-release/archive/release/dashing/pcl_msgs/1.0.0-1.zip;downloadfilename=pcl-msgs_1.0.0-1.zip"
SRC_URI[md5sum] = "cb912ba102ea76359f1226f8b59658db"
SRC_URI[sha256sum] = "666355e66018bc014112cc496cc51c7beead6c33130270560b484c1e5b189448"

S = "${WORKDIR}/pcl_msgs-release-release-dashing-pcl_msgs-1.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

