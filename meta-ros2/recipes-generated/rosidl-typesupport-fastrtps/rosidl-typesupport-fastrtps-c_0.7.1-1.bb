
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Generate the C interfaces for eProsima FastRTPS."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native fastcdr-native fastrtps-cmake-module-native fastrtps-native rosidl-cmake-native rosidl-generator-c-native rosidl-typesupport-fastrtps-cpp-native"
ROS_BUILD_EXPORT_DEPENDS = "rmw"
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-cmake-native fastcdr-native fastrtps-cmake-module-native fastrtps-native rosidl-cmake-native rosidl-generator-c-native rosidl-typesupport-fastrtps-cpp-native"
ROS_EXEC_DEPENDS = "rosidl-parser rosidl-typesupport-interface"
ROS_TEST_DEPENDS = "ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/dashing/rosidl_typesupport_fastrtps_c/0.7.1-1.zip;downloadfilename=rosidl-typesupport-fastrtps-c_0.7.1-1.zip"
SRC_URI[md5sum] = "a2edf4ec8c2884638532eb492ca388b3"
SRC_URI[sha256sum] = "acb68ecd0aaaa5e93c942e75be01e6b923ea376d85fc24b8dda0e33430f933dc"

S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-dashing-rosidl_typesupport_fastrtps_c-0.7.1-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

