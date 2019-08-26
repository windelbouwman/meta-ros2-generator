
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


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/rosbag2/0.1.4-1.zip;downloadfilename=rosbag2_0.1.4-1.zip"
SRC_URI[md5sum] = "6bc403ef468acbc6abb1001422e71186"
SRC_URI[sha256sum] = "296e07876a25549bf85f6cf68916c103b1aa4a9c3a7a4bbd9968dc95f593adde"

S = "${WORKDIR}/rosbag2-release-release-dashing-rosbag2-0.1.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

