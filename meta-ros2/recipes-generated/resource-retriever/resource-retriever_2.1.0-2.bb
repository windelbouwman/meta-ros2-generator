
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package retrieves data from url-format files such as http://, ftp://, package:// file://, etc., and loads the data into memory. The package:// url for ros packages is translated into a local file:// url.  The resourse retriever was initially designed to load mesh files into memory, but it can be used for any type of data. The resource retriever is based on the the libcurl library. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ament-index-cpp libcurl-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = "ament-index-cpp libcurl-vendor"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-cpp libcurl-vendor"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/resource_retriever-release/archive/release/dashing/resource_retriever/2.1.0-2.zip;downloadfilename=resource-retriever_2.1.0-2.zip"
SRC_URI[md5sum] = "41802b9a3a39663384dcc5fd861297fe"
SRC_URI[sha256sum] = "76fb22c0e1e765d39db78813fe7d7664b9d6beacb302de7b0a7d1f710e6a8366"

S = "${WORKDIR}/resource_retriever-release-release-dashing-resource_retriever-2.1.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

