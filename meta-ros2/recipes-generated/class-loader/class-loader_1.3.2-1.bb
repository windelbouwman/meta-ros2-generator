
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The class_loader package is a ROS-independent package for loading plugins during runtime and the foundation of the higher level ROS "pluginlib" library. class_loader utilizes the host operating system's runtime loader to open runtime libraries (e.g. .so/.dll files), introspect the library for exported plugin classes, and allows users to instantiate objects of these exported classes without the explicit declaration (i.e. header file) for those classes. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "console-bridge-vendor libconsole-bridge-dev libpoco-dev poco-vendor"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "console-bridge-vendor libconsole-bridge-dev libpoco-dev poco-vendor"
ROS_TEST_DEPENDS = "ament-cmake-gtest ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/class_loader-release/archive/release/dashing/class_loader/1.3.2-1.zip;downloadfilename=class-loader_1.3.2-1.zip"
SRC_URI[md5sum] = "44b56e618187d2aed8dd22ef3baa8834"
SRC_URI[sha256sum] = "b4913e3f0e81ac51e97735a7ef52909b0cc5c2b78a4124d9c1f99dcfdb3c4dcc"

S = "${WORKDIR}/class_loader-release-release-dashing-class_loader-1.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

