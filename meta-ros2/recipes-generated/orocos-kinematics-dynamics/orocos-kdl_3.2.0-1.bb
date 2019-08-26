
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package contains a recent version of the Kinematics and Dynamics Library (KDL), distributed by the Orocos Project. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen"
ROS_BUILDTOOL_DEPENDS = "cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "eigen pkg-config"
ROS_TEST_DEPENDS = "cppunit"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"


SRC_URI = "https://github.com/ros2-gbp/orocos_kinematics_dynamics-release/archive/release/dashing/orocos_kdl/3.2.0-1.zip;downloadfilename=orocos-kdl_3.2.0-1.zip"
SRC_URI[md5sum] = "75e19ed18893dcba5c3491a38fdbfae6"
SRC_URI[sha256sum] = "c298756021ee6cc401ad5accbda4f7b6042765ded3d19fce4071bc96948c786a"

S = "${WORKDIR}/orocos_kinematics_dynamics-release-release-dashing-orocos_kdl-3.2.0-1"

ROS_BUILD_TYPE = "cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

