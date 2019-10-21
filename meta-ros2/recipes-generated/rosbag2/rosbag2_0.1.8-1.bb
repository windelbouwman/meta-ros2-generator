
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "ROSBag2 client library"
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rosbag2-storage rosidl-generator-cpp rosidl-typesupport-cpp rosidl-typesupport-introspection-cpp shared-queues-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rosbag2-storage rosidl-generator-cpp rosidl-typesupport-cpp rosidl-typesupport-introspection-cpp shared-queues-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp pluginlib poco-vendor rcutils rosbag2-storage rosidl-generator-cpp rosidl-typesupport-cpp rosidl-typesupport-introspection-cpp shared-queues-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common rosbag2-test-common test-msgs"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2/0.1.8-1.zip;downloadfilename=rosbag2_0.1.8-1.zip"
SRC_URI[md5sum] = "0d73be35c19090972865449593660ffd"
SRC_URI[sha256sum] = "99862659a703db2734eddf1cbc16af7a1446bca140c2a0611c36ddf433dbedf1"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2-0.1.8-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

