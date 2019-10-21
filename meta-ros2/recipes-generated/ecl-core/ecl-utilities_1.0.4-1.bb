
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Includes various supporting tools and utilities for c++ programming. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-concepts ecl-license ecl-mpl"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-concepts ecl-license ecl-mpl"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_utilities/1.0.4-1.zip;downloadfilename=ecl-utilities_1.0.4-1.zip"
SRC_URI[md5sum] = "9bc6c77fabaab46a05d86554b8b8c297"
SRC_URI[sha256sum] = "5dcefd49b866b6745b0859594cf6715bb7fe51bd83ed7c11fb843b5b80a47f46"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_utilities-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

