
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


SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/dashing/sqlite3_vendor/0.1.4-1.zip;downloadfilename=sqlite3-vendor_0.1.4-1.zip"
SRC_URI[md5sum] = "ab1d1ba500c86420fb765a022ca28143"
SRC_URI[sha256sum] = "ffc976eac3de6be49962ca8eee6ca16d099a95bd5f779c29ecbd06620fda3786"

S = "${WORKDIR}/rosbag2-release-release-dashing-sqlite3_vendor-0.1.4-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

