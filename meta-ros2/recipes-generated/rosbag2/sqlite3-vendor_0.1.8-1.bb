
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "SQLite 3 vendor package"
SECTION = "devel"

ROS_BUILD_DEPENDS = "libsqlite3-dev"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libsqlite3-dev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libsqlite3-dev"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/sqlite3_vendor/0.1.8-1.zip;downloadfilename=sqlite3-vendor_0.1.8-1.zip"
SRC_URI[md5sum] = "bf13305750c8107a77a4ce1351f9c2c0"
SRC_URI[sha256sum] = "98f2bfdac8a4b02a1812e46f96088b8ba41564d33e45679a1b7b89865837c0eb"

S = "${WORKDIR}/rosbag2-release-release-dashing-sqlite3_vendor-0.1.8-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

