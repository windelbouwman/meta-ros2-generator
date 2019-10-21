
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Template based exceptions - these are simple and practical and avoid the proliferation of exception types. Although not syntatactically ideal, it is convenient and eminently practical. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-ros-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ecl-config ecl-errors ecl-license"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/dashing/ecl_exceptions/1.0.4-1.zip;downloadfilename=ecl-exceptions_1.0.4-1.zip"
SRC_URI[md5sum] = "6031de416e229f81b6150dcb3a544572"
SRC_URI[sha256sum] = "c1af6abdfff3eea9ae3cfc43cb3ca1cb0c89130d48d524459f208cfd73f91053"

S = "${WORKDIR}/ecl_core-release-release-dashing-ecl_exceptions-1.0.4-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

