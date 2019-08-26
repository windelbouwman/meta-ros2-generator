
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " C++ API to access the ament resource index. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/dashing/ament_index_cpp/0.7.0-1.zip;downloadfilename=ament-index-cpp_0.7.0-1.zip"
SRC_URI[md5sum] = "9a19409d6b82ec9eaa80e48cef72a21f"
SRC_URI[sha256sum] = "601ebb9fe638f315bf8de13b9b763790b52853e1c4dbbf5211081bfc7add4b50"

S = "${WORKDIR}/ament_index-release-release-dashing-ament_index_cpp-0.7.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

