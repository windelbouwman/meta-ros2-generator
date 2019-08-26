
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The core of the ament buildsystem in CMake.  Several subcomponents provide specific funtionalities: * environment: provide prefix-level setup files * environment_hooks: provide package-level setup files and environment hooks * index: store information in an index and retrieve them without crawling * package_templates: templates from the ament_package Python package * symlink_install: use symlinks for CMake install commands "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-package-native cmake-native python3-catkin-pkg-modules-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = "ament-package-native cmake-native python3-catkin-pkg-modules-native"
ROS_EXEC_DEPENDS = ""
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/dashing/ament_cmake_core/0.7.3-1.zip;downloadfilename=ament-cmake-core_0.7.3-1.zip"
SRC_URI[md5sum] = "1ddd6fd7afff3eca9c159bb7a32c1d5d"
SRC_URI[sha256sum] = "ed484b1aa487b930d2cee2622402725bf48fb7ba15b11f26bae1a05e789d6234"

S = "${WORKDIR}/ament_cmake-release-release-dashing-ament_cmake_core-0.7.3-1"

ROS_BUILD_TYPE = "ament_inception"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

